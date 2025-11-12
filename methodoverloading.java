class FigureArea
{
public int area(int side)
{
System.out.println("...Calculating Area of a Square...");
return side * side;
}
public double area(double length, double width)
{
System.out.println("...Calculating Area of a Rectangle...");
return length * width;
}
public double area(int base, int height)
{
System.out.println("...Calculating Area of a Triangle...");
return 0.5 * base * height;
}
public double area(double radius)
{
System.out.println("...Calculating Area of a Circle...");
return Math.PI * radius * radius;
}
}
public class MethodOverloadingFigure
{
public static void main(String[] args)
{
System.out.println("--- Experiment 4: Area using Method Overloading ---");
FigureArea calc = new FigureArea();

System.out.println("Area of Square (side=5): " + calc.area(5));
System.out.println("Area of Rectangle (l=10.5, w=5.0): " + calc.area(10.5, 5.0));
System.out.println("Area of Triangle (b=8, h=6): " + calc.area(8, 6));
System.out.println("Area of Circle (r=3.0): " + calc.area(3.0));
}
}
