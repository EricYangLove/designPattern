package xin.yangmj.decorate.decorated.impl;

import xin.yangmj.decorate.decorated.Beverage;

/**
 * 一种具体的饮料
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:30
 **/
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 2.09;
    }
}
