class CurrentAccount extends Account
{
    public CurrentAccount(String name, int accNo, int bal, String type)
    {
        super(name, accNo, bal, type);
    }

    
    

    public void display()
    {
        System.out.println("Name :"+name+"\nAccount No: "+accNo+"\nAccount Type: "+type+"\nBalance: "+bal);
    }
}
