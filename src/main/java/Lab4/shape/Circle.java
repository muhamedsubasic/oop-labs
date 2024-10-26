package Lab4.shape;

public class Circle extends Shape{
    private double radius;
    public Circle(String color, FillType fill, double radius){
        super(color, fill);
        this.radius = radius;
    }

    public double calculateCircumference(double r, double pi) {
        return 2 * r * pi;
    }

    public double calculateCircumference(double r) {
        return 2 * r * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo(){
        System.out.println("Shape: Circle");
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area " + getArea());
    }
}