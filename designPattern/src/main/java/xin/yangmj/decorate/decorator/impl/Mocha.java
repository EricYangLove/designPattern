package xin.yangmj.decorate.decorator.impl;

import xin.yangmj.decorate.decorated.Beverage;
import xin.yangmj.decorate.decorator.CondimentDecorator;

/**
 * 这是调料的一种实现
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:35
 **/
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 表明是该调料装饰者饮料，这也解释了
     * 为什么调料装饰者要有个抽象的getDescription()方法
     *
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 这是总价钱，包含包装的饮料和此调料
     *
     * @return
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
