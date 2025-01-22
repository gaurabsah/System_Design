package design_patterns.strategy_pattern.withStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
