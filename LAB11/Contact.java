class Contact {
    
    String name;
    String Email;
    String PhoneNumber;

    public Contact(String name, String Email, String PhoneNumber)
    {
        this.name = name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        System.out.println("Contact saved!\nName: "+this.name+"\nEmail: "+this.Email+"\nPhone Number: "+this.PhoneNumber);
    }

}