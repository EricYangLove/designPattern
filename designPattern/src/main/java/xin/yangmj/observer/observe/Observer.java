package xin.yangmj.observer.observe;

/**
 * 这是观察者接口，所有具体观察者都应实现此接口
 *
 * @author Eric Yang
 * @create 2017-10-07 下午4:00
 **/
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
