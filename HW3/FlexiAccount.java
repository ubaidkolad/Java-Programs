class FlexiAccount extends Account
{
    int days = 0;
    int tenure = 4;
    FlexiAccount(String name, int accNo, int bal, String type)
    {
        super(name, accNo, bal, type);
    }

    public void deposit(int amount)
    {
        if(amount%500==0||amount%100==0)
        {
            bal = bal + amount;
            System.out.println(bal+" deposited in your account.");
        }
        else{
            System.out.println("Sorry, we cannot deposit your amount.");
        }
    }

    public void withdraw(int amount)
    {
        if (days == tenure) {
            bal = bal - amount;
            System.out.println(amount + " withdrawn from your account\nYou have " + bal + " left in your account.");
        } else {
            System.out.println("Sorry, we cannot withdraw your amount. Your tenure is still valid.");
        }
    }
    
    public void ten()
    {
        days++;
    }
    public void display()
    {
        System.out.println("Name :"+name+"\nAccount No: "+accNo+"\nAccount Type: "+type+"\nBalance: "+bal);
    }
}