package design_patterns.strategy_pattern.withOutStrategyPattern;

public class SportsVehicle extends Vehicle{

//    need advanced driving skill
    @Override
    public void drive(){
        System.out.println("Advanced Drive");
    }
}
