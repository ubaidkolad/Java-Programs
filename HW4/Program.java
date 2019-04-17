class Program
{
    public static void main(String[] args) {
        
        SavingsAccount s = new SavingsAccount();
        s.Account("Ubaid", 1234, 1000, "Savings Account");
        s.display();
        s.deposit(1000);
        s.deposit(1000);
        s.deposit(1000);
        s.deposit(1000);
       
       
        System.out.println();

        CurrentAccount c = new CurrentAccount();
        c.Account("Abdul", 2345, 2000, "Current Account");
        c.display();

        c.deposit(1000);
        c.deposit(1000);
        c.deposit(1000);
        c.deposit(1000);
        c.deposit(1000);
        c.deposit(1000);

        c.withdraw(500);
        c.withdraw(500);
        c.withdraw(500);
        
       
       
       
        System.out.println();
        FlexiAccount f = new FlexiAccount();
        f.Account("Mustaqimm", 9867, 2000, "Flexi Deposit Account");
        f.display();
        f.deposit(1000);
        f.ten();
        f.ten();
        f.ten();
        //f.ten();
        
        f.withdraw(200);
    }
}