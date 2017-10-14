package xin.yangmj.decorate.decorated.impl;

import xin.yangmj.decorate.decorated.Beverage;

/**
 * 这是浓缩咖啡，一种具体的饮料
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:30
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
