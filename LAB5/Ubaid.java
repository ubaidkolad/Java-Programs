import java.util.Scanner;
class Ubaid
{
    int id;
    String name;
    Scanner sc = new Scanner(System.in);
    

    public void Visual(int id, String name)
    {
        int length = name.length();
       
            while (length<3) {
                System.out.println(
                    "You name should be of more than three characters. Please enter again.\nEnter your name: ");
            name = sc.next();
            
            }
    
        
            name = sc.next();
        
    }

}