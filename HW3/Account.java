class Account 
{
    public int accNo;
    public String name;
    public String type;
    public int bal;
    
    public Account(String name, int accNo, int bal, String type)
    {
        this.name = name;
        this.accNo = accNo;
        this.bal = bal;
        this.type = type;
    }
    
    public void deposit(int amount)
    {
        bal = bal + amount;
        System.out.println(bal+" deposited in your account.");
    }

    public void withdraw(int amount)
    {
        if (bal < 0)
        {
            System.out.println("You have insufficient balance");
        }
        else {
            bal = bal - amount;
            System.out.println(amount + "withdrawn successfully!\nYou have " + bal + " rupees in your account.");
        }
    }

}