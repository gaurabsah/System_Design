package design_patterns.strategy_pattern.withStrategyPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
