package xin.yangmj.decorate;

import xin.yangmj.decorate.decorated.Beverage;
import xin.yangmj.decorate.decorated.impl.DarkRoast;
import xin.yangmj.decorate.decorated.impl.Espresso;
import xin.yangmj.decorate.decorated.impl.HouseBlend;
import xin.yangmj.decorate.decorator.impl.Mocha;
import xin.yangmj.decorate.decorator.impl.Soy;
import xin.yangmj.decorate.decorator.impl.Whip;

/**
 * 这是客户端，用来测试供应咖啡
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:50
 **/
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        // 没有加任何调料
        System.out.println(beverage.getDescription() + "--- $" + beverage.cost());

        // 用两个Mocha装饰它，然后再用Whip装饰
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "--- $" + beverage2.cost());

        // 分别用Soy, Mocha, Whip来装饰
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "--- $" + beverage3.cost());
    }
}
