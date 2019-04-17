import java.util.Scanner;
class Car
{
    Scanner sc= new Scanner(System.in);
    String name;
    String type;
    int modelYear;

    void acceptData()
    {   
        System.out.println("Enter Car's name: ");
        name=sc.nextLine();

        System.out.println("What type of car is it? ");
        type=sc.nextLine();
    

        System.out.println("Enter the manufacturing year of the car: ");
        modelYear=sc.nextInt();
    }

    void displayData()
    {
        System.out.println("Name: "+name+"\nCar Type: "+type+"\nYear of Manufacture: "+modelYear);
    }
}