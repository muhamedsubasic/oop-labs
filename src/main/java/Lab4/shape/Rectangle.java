package Lab4.shape;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color, FillType fill, double width, double height){
        super(color, fill);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void displayInfo(){
        System.out.println("Shape: Rectangle");
        super.displayInfo();
        System.out.println("Area " + getArea());
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
