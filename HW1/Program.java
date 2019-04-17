import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Animal A= new Animal();
        Car C= new Car();
        Employee E= new Employee();
        Student S= new Student();

        System.out.println("Whose data you want to insert?\n1.Animal\n2.Car\n3.Employee\n4.Student");
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 1: A.acceptData();
                    A.displayData();
                    break;

            case 2: C.acceptData();
                    C.displayData();
                    break;

            case 3: E.acceptData(); 
                    E.displayData();
                    break;

            case 4: S.acceptData();
                    S.displayData();
                    break;

            default: System.out.println("INVALID CHOICE !");
        }
    }
}