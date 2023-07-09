package src.FactoryPattern;

// Factory pattern is required when we create objects on conditional basis
public class Main {

    public static void main(String args[]){

        ShapeFactory obj = new ShapeFactory();
        Shape shape = obj.getShape("CIRCLE");
        shape.draw();
    }
}
