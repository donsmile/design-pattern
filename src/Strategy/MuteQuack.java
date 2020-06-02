package Strategy;

import Strategy.inter.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不做, 不会叫");
    }
}