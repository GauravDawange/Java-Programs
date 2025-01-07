package Patterns;
import java.util.*;

public class Reverse_Right_Pyramid 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number You Want to print Pattern");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
    

