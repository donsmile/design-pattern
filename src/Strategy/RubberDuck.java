package Strategy;

import Strategy.inter.Duck;

/**
 * @ClassName RubberDuck
 * @Description
 * @Author dd
 * @Date 2020/5/29 11:04
 * @Version 1.0
 **/
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("可爱的黄色橡皮鸭");
    }

    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        //运行时动态改变行为
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.display();
    }
}