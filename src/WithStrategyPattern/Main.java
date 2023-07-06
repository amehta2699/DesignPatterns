package src.WithStrategyPattern;

public class Main {
    public static void main(String args[]) {
        Vehicle Ferrari = new SportsVehicle();
        Vehicle Truck = new GoodsVehicle();

        Ferrari.drive();
        Truck.drive();
    }
}
