package xin.yangmj.strategy.duck;

import xin.yangmj.strategy.behavior.fly.FlyBehavior;
import xin.yangmj.strategy.behavior.quack.QuackBehavior;

/**
 * 这是鸭子抽象类
 *
 * @author Eric Yang
 * @create 2017-10-06 下午1:29
 **/
public abstract class Duck {

    // 加上这两个public目的：Duck和其实现类不在同一包下，且Duck在外层包下
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck(){}

    // 委托给行为类
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    // 所有鸭子共有的行为
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    // 动态设定行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
