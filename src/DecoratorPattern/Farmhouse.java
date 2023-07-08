package src.DecoratorPattern;

// Farmhouse is-a BasePiza -> RelationShip
public abstract  class Farmhouse extends BasePizza{

    @Override
    public int cost() {
        return 200;
    }
}
