package src.WithStrategyPattern;

import src.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super( new SportsDriveStrategy());
    }
}
