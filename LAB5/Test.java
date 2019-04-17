import java.util.Scanner;
class Test
{ 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);     
      Ubaid U = new Ubaid();
    System.out.println("Please Enter your name: ");
    String n = sc.next();
   
    System.out.println("Please Enter your ID: ");
    int e = sc.nextInt();
   
        U.Visual(e,n);
    
      }
}