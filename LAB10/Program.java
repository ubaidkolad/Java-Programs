import java.util.Scanner;
class Program 
{
    public static void main(String[] args) 
    {

        calculate();
                
    }

     public static void calculate()
     {  Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int val1 = sc.nextInt();
    
        System.out.println("Please enter number 2: ");
        int val2 = sc.nextInt();
    
        div(val1,val2);
     }
     public static void div(int val1,int val2)
     {
        int ans=val1/val2;
        System.out.println(ans);

     }
}