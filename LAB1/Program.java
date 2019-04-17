class Program
{
        public static void main(String args[])
    {

    
        Account person= new Account();
        
        person.holderName="Ubaid";
        person.accNo=9795547;
        person.balance=500000.00;
        person.type="Current";

    
        System.out.println("Name "+person.holderName);
        System.out.println("Account No: "+person.accNo);
        System.out.println("Balance "+person.balance);
    

    }
}