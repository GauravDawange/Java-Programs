package Patterns;
import java.util.*;
class Left_Pascals_Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number When You want to print Pattern");
        int n= sc.nextInt();
        int i, j, k, l, m;

        for(i=1; i<=n; i++)
        {
            for(j=n-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(k=n-1; k>=i; k--)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}