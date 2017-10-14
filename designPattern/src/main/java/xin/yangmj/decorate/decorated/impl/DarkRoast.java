package xin.yangmj.decorate.decorated.impl;

import xin.yangmj.decorate.decorated.Beverage;

/**
 * 一种具体的饮料
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:30
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
