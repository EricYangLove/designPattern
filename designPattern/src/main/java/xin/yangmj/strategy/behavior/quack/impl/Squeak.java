package xin.yangmj.strategy.behavior.quack.impl;

import xin.yangmj.strategy.behavior.quack.QuackBehavior;

/**
 * 橡皮鸭吱吱叫类
 *
 * @author Eric Yang
 * @create 2017-10-06 下午1:45
 **/
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
