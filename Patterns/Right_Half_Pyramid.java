
package Patterns;
import java.util.*;

public class Right_Half_Pyramid 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number When You want to Print Star Pattern");
        int n = sc.nextInt();
        int i,j;
        for(i=0; i<n; i++)
        {
            
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
    
}
