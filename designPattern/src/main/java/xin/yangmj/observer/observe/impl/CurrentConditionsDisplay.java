package xin.yangmj.observer.observe.impl;

import xin.yangmj.observer.observe.DisplayElement;
import xin.yangmj.observer.observe.Observer;
import xin.yangmj.observer.subject.Subject;

/**
 * 具体布告板，相当于具体观察者实现类
 *
 * @author Eric Yang
 * @create 2017-10-07 下午4:28
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 通过构造器，可以将此观察者注册到主题中
     *
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 当观测值更新时，将最新数据保存起来
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     * 在该布告板上展示最新的观测值数据
     */
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }
}
