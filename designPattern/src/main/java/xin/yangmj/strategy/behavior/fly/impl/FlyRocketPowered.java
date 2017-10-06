package xin.yangmj.strategy.behavior.fly.impl;

import xin.yangmj.strategy.behavior.fly.FlyBehavior;

/**
 * 拥有火箭动力的飞行行为
 *
 * @author Eric Yang
 * @create 2017-10-06 下午2:16
 **/
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
