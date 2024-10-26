package Lab4.shape;

public class Shape {
    public enum FillType {
        FILLED,
        NOT_FILLED
    }
    private String color;
    private FillType fill;
    public Shape (String color, FillType fill){
        this.color = color;
        this.fill = fill;
    }

    public double getArea() {
        return 0;
    }

    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("Fill: " + fill);
    }
}