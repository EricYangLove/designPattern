package xin.yangmj.strategy.duck.impl;

import xin.yangmj.strategy.behavior.fly.impl.FlyNoWay;
import xin.yangmj.strategy.behavior.quack.impl.Quack;
import xin.yangmj.strategy.duck.Duck;

/**
 * 模型鸭子
 *
 * @author Eric Yang
 * @create 2017-10-06 下午2:11
 **/
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
