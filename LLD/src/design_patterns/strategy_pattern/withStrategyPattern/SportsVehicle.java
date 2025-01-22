package design_patterns.strategy_pattern.withStrategyPattern;

import design_patterns.strategy_pattern.withStrategyPattern.strategy.AdvancedDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new AdvancedDriveStrategy());
    }
}
