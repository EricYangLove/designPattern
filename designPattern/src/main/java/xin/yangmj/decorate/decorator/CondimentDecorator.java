package xin.yangmj.decorate.decorator;

import xin.yangmj.decorate.decorated.Beverage;

/**
 * 这是调料抽象类，角色相当于装饰者
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:28
 **/
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
