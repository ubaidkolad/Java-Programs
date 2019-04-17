class CurrentAccount implements Account
{
    int bal, accNo;
    String type, name;
    public void Account(String name, int accNo, int bal, String type)
    {
        this.name=name;
        this.accNo=accNo;
        this.bal=bal;
        this.type = type;
    }

    
    public void withdraw(int amount)
    {
        if(bal<0)
        {
            System.out.println("You have insufficient balance");
        }
        else
        {
            bal=bal-amount;
            System.out.println(amount+" withdrawn succesfully!. You have "+bal+" in your account.");
        }
    }

    public void deposit(int amount)
    {
        bal = bal + amount;
        System.out.println(amount+" deposited in your account. You have "+bal+" in your account. ");
    }
    public void display()
    {
        System.out.println("Name :"+name+"\nAccount No: "+accNo+"\nAccount Type: "+type+"\nBalance: "+bal);
    }

    public void ten()
    {
            //no implementation;

    }
}
