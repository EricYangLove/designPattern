package xin.yangmj.strategy.behavior.fly.impl;

import xin.yangmj.strategy.behavior.fly.FlyBehavior;

/**
 * 这是飞行行为得实现，给“真会”飞的鸭子用...
 *
 * @author Eric Yang
 * @create 2017-10-06 下午1:33
 **/
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
