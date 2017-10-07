package xin.yangmj.observer;

import xin.yangmj.observer.observe.impl.CurrentConditionsDisplay;
import xin.yangmj.observer.subject.impl.WeatherData;

/**
 * 测试类，可用于启动气象站
 *
 * @author Eric Yang
 * @create 2017-10-07 下午4:39
 **/
public class WeatherStation {

    public static void main(String[] args){

        // 创建具体主题，并初始化所管理的观察者为空
        WeatherData weatherData = new WeatherData();

        // 暂时只写一个面板，其他类似eg:StatisticsDisplay, ForecastDisplay等
        // 也可以后续扩展，实现自己特定的面板
        // 创建该观察者，隐含了将该观察者注册到上面具体主题中
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        // 通知观察者
        weatherData.notifyObserver();
        // 测量值发生变化
        weatherData.setMeasurements(82, 70, 29.3f);
        weatherData.measurementsChanged();
    }
}
