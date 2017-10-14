package xin.yangmj.decorate.decorated.impl;

import xin.yangmj.decorate.decorated.Beverage;

/**
 * 另一种饮料的实现
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:34
 **/
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
