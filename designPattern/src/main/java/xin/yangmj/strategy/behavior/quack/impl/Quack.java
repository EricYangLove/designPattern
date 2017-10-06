package xin.yangmj.strategy.behavior.quack.impl;

import xin.yangmj.strategy.behavior.quack.QuackBehavior;

/**
 * 鸭子呱呱叫类
 *
 * @author Eric Yang
 * @create 2017-10-06 下午1:41
 **/
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
