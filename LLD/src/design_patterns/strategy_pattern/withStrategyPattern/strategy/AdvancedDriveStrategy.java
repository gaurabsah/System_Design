package design_patterns.strategy_pattern.withStrategyPattern.strategy;

public class AdvancedDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Advanced Drive");
    }
}
