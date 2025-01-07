package Patterns;
import java.util.*;

public class Reverse_Left_Half_Pyramid 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number When You Want To Print Pattern");
        int n = sc.nextInt();
        int i,j;
        for(i=0; i<=n; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(j=n; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
