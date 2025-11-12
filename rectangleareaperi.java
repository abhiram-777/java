class Rectangle
{
public double areaRect(double x, double y)
{
double area = x * y;
return area;
}
public double periRect(double x, double y)
{
double perimeter = 2 * (x + y);
return perimeter;
}
}
class RectangleDemo
{
public static void main(String args[])
{
Rectangle r = new Rectangle();
double a = r.areaRect(10, 20);
System.out.println("Area:" + a);
double p = r.periRect(10, 20);
System.out.println("Perimeter:" + p);
}
}
