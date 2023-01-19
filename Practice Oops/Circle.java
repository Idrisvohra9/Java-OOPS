public class Circle {
    private double radius=1.0;
    private String color="Red";
    
    public Circle(){}
    public Circle(double radius){
        double r = radius;
    }
    public double getRadius(){
        return r;
    }
    public String getArea() {
        double pi= Math.PI;
        double Area=pi*(r*r);
        return String.format("The Area of circle with radius: %f is %f.",r,Area);
    }
    
}
