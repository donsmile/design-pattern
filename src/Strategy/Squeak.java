package Strategy;

import Strategy.inter.QuackBehavior;

/**
 * @ClassName Squeak
 * @Description
 * @Author dd
 * @Date 2020/5/29 11:01
 * @Version 1.0
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}