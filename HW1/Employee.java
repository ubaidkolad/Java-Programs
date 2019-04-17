import java.util.Scanner;
class Employee
{
    Scanner sc= new Scanner(System.in);
    String name;   
    int age;
    int salary;
    String dept;


    void acceptData()
    {
        System.out.println("Enter the name of the employee: ");
        name=sc.nextLine();

        System.out.println("Enter the age of the employee: ");
        age=sc.nextInt();

        System.out.println("Enter the salary of the employee: ");
        salary=sc.nextInt();

        System.out.println("Enter the department of the employee: ");
        dept=sc.nextLine();

    }

    void displayData()
    {
        System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nDepartment: "+dept);
    }
}
