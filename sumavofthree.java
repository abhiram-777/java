import java.util.Scanner;
class Average
{
void getInput()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers: ");
double num1 = sc.nextDouble();
double num2 = sc.nextDouble();
double num3 = sc.nextDouble();
double s = sum(num1, num2, num3);
System.out.println("Sum is: " + s);
double avg = average(s);
System.out.println("Average is: " + avg);
}
public double sum(double a, double b, double c)
{
return (a + b + c);
}
public double average(double a)
{
return a / 3;
}
}
public class AverageDemo
{
public static void main(String args[])
{
Average avgobj = new Average();
avgobj.getInput();
}
}
