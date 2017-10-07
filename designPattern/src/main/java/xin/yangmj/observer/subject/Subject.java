package xin.yangmj.observer.subject;

import xin.yangmj.observer.observe.Observer;

/**
 * 这是主题接口，所有具体主题都应实现此接口
 *
 * @author Eric Yang
 * @create 2017-10-07 下午3:56
 **/
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
