import java.util.Scanner;

class Account
{
        Scanner sc= new Scanner(System.in);

        int accNo;
        String holderName;
        double balance;
        String type;


void acceptData()
{
    System.out.println("Enter your name: ");
    holderName=sc.next();
    System.out.println("Enter your Account number: ");
    accNo=sc.nextInt();
    System.out.println("Enter your Balance: ");
    balance=sc.nextDouble();


}

void displayData()
{
    System.out.println("Name: "+holderName+"\nBalance: "+balance+"\nAccount number: "+accNo);
}

}