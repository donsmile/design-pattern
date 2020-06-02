package Strategy.inter;

import Strategy.FlyWithWings;
import Strategy.Quack;
import Strategy.inter.FlyBehavior;
import Strategy.inter.QuackBehavior;

/**
 * @ClassName Duck
 * @Description
 * @Author dd
 * @Date 2020/5/29 11:02
 * @Version 1.0
 **/
public abstract class Duck {
    //针对接口编程的体现
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    //设置一个默认的行为
    public Duck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void swim(){
        System.out.println("游泳");
    }

    //每个鸭子的外观不同, 在子类中实现
    public abstract void display();

    //执行呱呱叫的方法
    public void performQuack(){
        quackBehavior.quack();
    }

    //执行飞行的方法
    public void performFly(){
        flyBehavior.fly();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}