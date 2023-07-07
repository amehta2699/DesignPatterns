package src.WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    //    Code duplicate as in SportsVehicle Vehicle -> this problem can be solved using STRATEGY PATTERN
    @Override
    public void drive() {
        System.out.println("Sports drive capability");
    }
}
