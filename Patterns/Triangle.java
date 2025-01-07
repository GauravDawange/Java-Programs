package Patterns;
import java.util.*;
public class Triangle
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number When You want to print Pattern");
        int n = sc.nextInt();
        int i, j, k, l;
        for(i=0; i<=n; i++)
        {
            for(j=n; j>=i; j--)
            {
                System.out.print(" ");

            }
            for(k=0; k<=i; k++)
            {
                System.out.print(" *");
            }
            for(l=n; l>=i; l--)
            {
                System.out.print(" ");
            }
            
            System.out.println();

        }
    }
}
