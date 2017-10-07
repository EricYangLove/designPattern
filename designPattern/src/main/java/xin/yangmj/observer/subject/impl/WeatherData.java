package xin.yangmj.observer.subject.impl;

import xin.yangmj.observer.observe.Observer;
import xin.yangmj.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是WeatherData类，实现主题接口
 *
 * @author Eric Yang
 * @create 2017-10-07 下午4:08
 **/
public class WeatherData implements Subject {

    // 用来封装主题所管理的观察者
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    /**
     * 用于注册观察者到该主题中
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 若观察者想取消注册，则调用该方法
     *
     * @param o
     */
    public void removeObserver(Observer o) {

        int i = observers.indexOf(0);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者，将主题最新数据告知每个注册的观察者
     */
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，通知观察者
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 动态改变观测值
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    // WeatherData的其他方法
}
