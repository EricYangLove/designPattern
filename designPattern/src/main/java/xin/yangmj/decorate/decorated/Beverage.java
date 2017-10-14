package xin.yangmj.decorate.decorated;

/**
 * 这是饮料抽象类，角色相当于被装饰者
 *
 * @author Eric Yang
 * @create 2017-10-14 下午2:24
 **/
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
