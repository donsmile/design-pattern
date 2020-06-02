package Strategy;

import Strategy.inter.FlyBehavior;

/**
 * @ClassName FlyWithWings
 * @Description
 * @Author dd
 * @Date 2020/5/29 11:02
 * @Version 1.0
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞行");
    }
}
