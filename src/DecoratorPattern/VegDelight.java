package src.DecoratorPattern;

// VegDelight is-a BasePiza -> RelationShip
public abstract class VegDelight extends BasePizza{

    @Override
    public int cost() {
        return 120;
    }
}
