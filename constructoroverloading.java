class Student
{
private int id;
private String name;
private double gpa;

public Student()
{
this.id = 0;
this.name = "Unnamed";
this.gpa = 0.0;
System.out.println("Default Constructor: Created an unknown student.");
}
public Student(int id)
{
this.id = id;
this.name = "Unnamed";
this.gpa = 0.0;
System.out.println("Single Parameter Constructor: Created student with ID " + id);
}
public Student(int id, String name)
{
this.id = id;
this.name = name;
this.gpa = 0.0;
System.out.println("Two Parameters Constructor: Created student " + name + " (ID: " + id + ")");
}
public Student(int id, String name, double gpa)
{
this.id = id;
this.name = name;
this.gpa = gpa;
System.out.println("Full Parameters Constructor: Created student " + name + " (ID: " + id + ", GPA: " + gpa + ")");
}

public void display()
{
System.out.println("ID: " + id + ", Name: " + name + ", GPA: " + gpa);
}
}
public class ConstructorOverloadingDemo
{
public static void main(String[] args)
{
System.out.println("--- Experiment 3: Constructor Overloading ---");
Student s1 = new Student();
Student s2 = new Student(101);
Student s3 = new Student(102, "Alice");
Student s4 = new Student(103, "Bob", 3.85);
System.out.println("\n--- Student Details ---");
s1.display();
s2.display();
s3.display();
s4.display();
}
}
