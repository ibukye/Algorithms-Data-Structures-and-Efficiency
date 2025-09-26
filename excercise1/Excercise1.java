package excercise1;
class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
            
    }
    public Circle(double newRadius) {
        radius = newRadius;
    }
    // getter
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}


class Cylinder extends Circle {
    private double height;
    //private double radius;

    public Cylinder() {
        super();
        height=1.0;
    }
    public Cylinder(double height) {
        super();
        this.height=height;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height=height;
    }
    // getter
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return super.getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;       // ???
    }
}




public class Excercise1 {
    public static void main(String[] args) {
        Cylinder c1 =  new Cylinder();
        System.out.println("Cylinder:"
            + " radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " base area=" + c1.getArea()
            + " volume=" + c1.getVolume());

        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " base area=" + c2.getArea()
            + " volume=" + c2.getVolume());

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
            + " radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " base area=" + c3.getArea()
            + " volume=" + c3.getVolume());
    }
}
