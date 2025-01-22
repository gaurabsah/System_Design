package design_patterns.strategy_pattern.withOutStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    //    need advanced driving skill
    @Override
    public void drive(){
        System.out.println("Advanced Drive");
    }

//    there is code reuse both in OffRoadVehicle and SportsVehicle
}
