package src.DecoratorPattern;

// MArgertita is-a BasePiza -> RelationShip
public abstract class Margherita extends BasePizza{

    @Override
    public int cost(){
        return 100;
    }
}
