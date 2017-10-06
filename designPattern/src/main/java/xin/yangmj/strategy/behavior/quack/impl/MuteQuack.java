package xin.yangmj.strategy.behavior.quack.impl;

import xin.yangmj.strategy.behavior.quack.QuackBehavior;

/**
 * 什么都不做
 *
 * @author Eric Yang
 * @create 2017-10-06 下午1:43
 **/
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
