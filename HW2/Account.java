import java.util.Scanner;

class Account 
{
    Scanner sc = new Scanner(System.in);
    int accNo,ac, balance, wcount = 0, dcount = 0;
    String name, n;
    String type = "Savings";
    
    //to set the name of the user with a validation that the username should be of more than 4 characters.
    public void setName(String name) {
        int length = name.length();
        if (length < 4) {
            System.out.println("Your name should be of more than 4 characters");
            System.out.println("Please enter your name again: ");
            n = sc.nextLine();
            setName(n);

        }

        else {
            this.name = name;

        }
        System.out.println("**************************");
        System.out.println("Account Created Successfully!");
        System.out.println("**************************");
        System.out.println("Your name: " + this.name);
       
    }

    //to deposit the money in the account, which will add to the default 1000 account opening balance.
    public void deposit(int deposit) 
    {
        if(dcount>3)
        {
            System.out.println("Sorry you cannot deposit more than 3 times");
        }
        else
        {
        balance=balance+deposit;
        System.out.println("You have "+balance+" rupees in your account.");
        }
        dcount++;
    }
    //this will withdraw the amount only if minimum balance 1000 remains after deducting.
    public void withdraw(int amount)
    {
        if (wcount > 2) {
            System.out.println("Sorry you cannot withdraw more than 3 times");
        } else {
            int check = balance - amount;
            if (check < 1000) {
                System.out.println("Sorry you have unsufficient balance.");
            } else {
                balance = balance - amount;
                System.out.println(amount + " rupees has been withdrawn. Your account balance is " + balance);
            }
        }
        wcount++;
    }
    // this will set the account number with a validation that it should be of only 4 digits.
    public void setAccNo(int accNo)
    {
    
        
            if(accNo>=1000&&accNo<=9999)
            {
                this.accNo = accNo;
                System.out.println("Your Account Number: " + this.accNo);
                System.out.println("Account type: " + type);
                deposit(1000);
    
            }
            else
            {
                System.out.println("Your account number can only be of 4 digits. Enter again");
                ac=sc.nextInt();
                setAccNo(ac);
            }
        
    }
}