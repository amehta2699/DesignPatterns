package src.DecoratorPattern;

import src.DecoratorPattern.Decorator.ExtraCheese;
import src.DecoratorPattern.Decorator.Mushroom;

public class Main {

    public static void main(String args[]) {
        BasePizza basePizza1 = new ExtraCheese(new Margherita() {
            @Override
            public int cost() {
                return super.cost();
            }
        }) {
            @Override
            public int cost() {
                return super.cost();
            }
        };

        System.out.println("Margerita Piza with Extra Cheeze cost :" +basePizza1.cost());

        BasePizza basePizza2 = new Mushroom(new ExtraCheese(new Farmhouse() {
            @Override
            public int cost() {
                return super.cost();
            }
        }) {
            @Override
            public int cost() {
                return super.cost();
            }
        }) {
            @Override
            public int cost() {
                return super.cost();
            }
        };

        System.out.println("Farmhouse Piza with Extra Cheeze and mushrom cost :" +basePizza2.cost());

    }
}
