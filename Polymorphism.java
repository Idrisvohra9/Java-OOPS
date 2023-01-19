class Poly1
{
//overloading
    public static String area(int side)
    {
        return "The area of Square: "+side*side;
    }
    public static String area(int side1, int side2)
    {
        return "The area of rectangle: "+side1 * side2;
    }
}
// overriding
class Poly2 extends Poly1
{
    public static String area(double r)
    {
        double pi=3.14;
        return "The area of circle: "+pi*(r*r);
    }
}
// Main class for class instanciation/ Making a has-a relationship:
public class Polymorphism
{
    public static void main(String[] args)
    {
        Poly1 p=new Poly1();
        System.out.println(p.area(5));// This will invoke the area method that calculates area of square as the method takes one int argument.

        System.out.println(p.area(8,7));// This will invoke the area method that calculates area of rectangle as the method takes two int arguments.

        Poly2 p2=new Poly2();
        System.out.println(p2.area(12.00));// This will invoke the area method in the second classs and calculate area of circle as the method takes one Double argument.
    }
}