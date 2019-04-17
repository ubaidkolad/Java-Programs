class SavingsAccount implements Account
{
    boolean premium;
    int dcount = 1, wcount = 1;
    int bal, accNo;
    String type, name;
   
    public void Account(String name, int accNo, int bal, String type)
    {
        this.name=name;
        this.accNo=accNo;
        this.bal=bal;
        this.type = type;
        this.premium=premium;
    }

    public void  deposit(int amount)
    {
        if(dcount<4)
        {
            if (amount == -amount)
            {
                System.out.println("You cannot deposit negative amount.");
            }
            else {
                bal = bal + amount;
                System.out.println(bal+" deposited in your account.");
                dcount++;
            }

        }
        
        else
        {
            System.out.println("Sorry, you cannot deposit more than 3 times");
        }
        
    }   

    public void withdraw(int amount)
    {
        if(wcount<3)
        {   int check=bal-amount;
            if(check<1000)
            {
                System.out.println("Insufficient balance");
                wcount++;
            }
            else
            {
                bal=bal-amount;
                System.out.println(bal+" has been withdrawn successfully!");
            }
        }
        
    }

    public void display()
    {
        System.out.println("Name :" + name + "\nAccount No: " + accNo + "\nAccount Type: " + type + "\nBalance: " + bal
                + "\nIs the account premium? " + premium);
    }
    
    public String toString()
    {
        return "hi";
    }

    public void ten()
    {
            //no implementation;

    }
}
