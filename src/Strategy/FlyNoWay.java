package Strategy;

import Strategy.inter.FlyBehavior;

/**
 * @ClassName FlyNoWay
 * @Description
 * @Author dd
 * @Date 2020/5/29 11:02
 * @Version 1.0
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("什么都不做, 不能飞");
    }
}