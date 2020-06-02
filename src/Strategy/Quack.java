package Strategy;

import Strategy.inter.QuackBehavior;

/**
 * @ClassName Quack
 * @Description
 * @Author dd
 * @Date 2020/5/29 11:00
 * @Version 1.0
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
