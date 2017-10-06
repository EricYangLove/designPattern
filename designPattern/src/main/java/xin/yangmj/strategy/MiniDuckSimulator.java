package xin.yangmj.strategy;

import xin.yangmj.strategy.behavior.fly.impl.FlyRocketPowered;
import xin.yangmj.strategy.duck.Duck;
import xin.yangmj.strategy.duck.impl.MallardDuck;
import xin.yangmj.strategy.duck.impl.ModelDuck;

/**
 * 这是整个策略模式的测试类
 *
 * @author Eric Yang
 * @create 2017-10-06 下午2:33
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        // 动态设定行为
        Duck model = new ModelDuck();
        model.performFly();
        // 更改运行行为
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        // 哈哈哈，这是测试Git
    }
}
