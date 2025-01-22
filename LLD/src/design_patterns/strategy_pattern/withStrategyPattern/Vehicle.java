package design_patterns.strategy_pattern.withStrategyPattern;

import design_patterns.strategy_pattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy obj;

    public Vehicle(DriveStrategy driveObj){
        this.obj=driveObj;
    }

    public void drive(){
        obj.drive();
    }
}
