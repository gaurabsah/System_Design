package design_patterns.strategy_pattern.withStrategyPattern;

import design_patterns.strategy_pattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
