import java.util.Arrays;
import java.lang.Object;
//import org.apache.commons.lang3.ArrayUtils;


class ContactManager
{
    Contact[] Phonebook;
    Contact[] tempArray;
    public int count,k;

    
    public ContactManager()
    {
        count=0;
        Phonebook = new Contact[100];
        tempArray = new Contact[99];

    }

    public void addContact(Contact contact)
    {
        Phonebook[count] = contact;
        count++;
        System.out.println("You have " + count + " contacts in your phonebook.");

        
    }

    public Contact searchContact(String searchName)
    {
        for (int i = 0; i < count; i++) {
            if (Phonebook[i].name.equals(searchName)) {
                System.out.println("Match found!");
                System.out.println("Name: " + Phonebook[i].name + "\nEmail: " + Phonebook[i].Email + "\nPhone Number: "+ Phonebook[i].PhoneNumber);
                        return Phonebook[i];
            }
        }
        System.out.println("Match not found !");
        return null;
    }
    
    public void deleteNumber(String delName)
    {
        for (int i = 0, k = 0; i < 100; i++) {
            if (Phonebook[i].name.equals(delName)) {
                continue;
            } else {
                tempArray[k++] = Phonebook[i];
            }
        }

        System.out.println("Contact Deleted\nYou have " + --count + " contacts in your phonebook.");
    }
    
}
