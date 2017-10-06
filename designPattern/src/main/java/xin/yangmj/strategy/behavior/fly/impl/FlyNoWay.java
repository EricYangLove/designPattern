package xin.yangmj.strategy.behavior.fly.impl;

import xin.yangmj.strategy.behavior.fly.FlyBehavior;

/**
 * 这是飞行行为的实现，给“不会”飞的鸭子用...
 *
 * @author Eric Yang
 * @create 2017-10-06 下午1:36
 **/
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
