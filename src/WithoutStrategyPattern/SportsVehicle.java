package src.WithoutStrategyPattern;

public class SportsVehicle extends Vehicle {

//    Code duplicate as in Offroad Vehicle -> this problem can be solved using STRATEGY PATTERN
    public void drive() {
        System.out.println("sports drive capability");
    }
}
