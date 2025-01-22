package design_patterns.strategy_pattern.withStrategyPattern;

import design_patterns.strategy_pattern.withStrategyPattern.strategy.AdvancedDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new AdvancedDriveStrategy());
    }
}
