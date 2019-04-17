import java.util.Scanner;
class Student
{
    Scanner sc= new Scanner(System.in);   
    String name;
    int age;
    int marks;
    String course;

    void acceptData()
    {
        System.out.println("Enter the name of the student: ");
        name=sc.nextLine();

        System.out.println("Enter the age of the student: ");
        age=sc.nextInt();

        System.out.println("Enter the Total Marks of the student: ");
        marks=sc.nextInt();

        System.out.println("Enter the course: ");
        course=sc.nextLine();
    }

    void displayData()
    {
        System.out.println("\nName: "+name+"\nAge: "+age+"\nTotal Marks: "+marks+"\nCourse: "+course);
 
    }
}