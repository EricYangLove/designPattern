package xin.yangmj.strategy.duck.impl;

import xin.yangmj.strategy.behavior.fly.impl.FlyWithWings;
import xin.yangmj.strategy.behavior.quack.impl.Quack;
import xin.yangmj.strategy.duck.Duck;

/**
 * 这是绿头鸭子
 *
 * @author Eric Yang
 * @create 2017-10-06 下午2:05
 **/
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
