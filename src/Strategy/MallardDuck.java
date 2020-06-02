package Strategy;

import Strategy.inter.Duck;

/**
 * @ClassName MallardDuck
 * @Description
 * @Author dd
 * @Date 2020/5/29 11:03
 * @Version 1.0
 **/
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("绿头鸭");
    }

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.display();
    }
}
