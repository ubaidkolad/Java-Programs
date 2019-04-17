class Test
{
    public static void main(String[] args) {

        ContactManager cm = new ContactManager();

        cm.addContact(new Contact("Ubaid", "bhaid023@gmail.com", "9930875753"));
        System.out.println("---------------------------------------");
        cm.addContact(new Contact("Mustaqim", "b3@gmail.com", "9930875753"));
        System.out.println("---------------------------------------");
        cm.addContact(new Contact("Abdul", "abdul@gmail.com", "9876543210"));
        System.out.println("---------------------------------------");
        cm.searchContact("Abdul");
        System.out.println("---------------------------------------");
        try{
            cm.deleteNumber("Abdul");
        }
        catch(NullPointerException e)
        {
            System.out.println("No such name");
        }
                
        


        
    }

      
}