package src.DecoratorPattern.Decorator;

import src.DecoratorPattern.BasePizza;

public abstract class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza)
    {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }





}
