import java.util.Scanner;

class Animal
{
    Scanner sc= new Scanner(System.in);
    String name;
    int age;
    String breed;

    void acceptData()
    {   
        System.out.println("Enter Animal's Name");
        name=sc.nextLine();

        System.out.println("Enter Animal's Age");
        age=sc.nextInt();

        System.out.println("Enter Animal's Breed");
        breed=sc.nextLine();
    }

    void displayData()
    {
        System.out.println("Name: "+name+"\nAge: "+age+"\nBreed: "+breed);
    }

}
