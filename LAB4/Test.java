import java.util.Scanner;
class Test
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     
        int e;
        String n;
        Ubaid U = new Ubaid();
        System.out.println("Enter your ID");
        e=sc.nextInt();
        U.setEmployeeID(e);
        System.out.println("Enter your name");
        n=sc.next();
        U.setName(n);


    }
}