package design_patterns.creational_pattern.factory_pattern;

public class ShapeFactory {

    Shape getShape(String input){

//        switch (input){
//            case "CIRCLE":
//                return new Circle();
//            case "RECTANGLE":
//                return new Rectangle();
//            default:
//                return null;
//        }

        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
