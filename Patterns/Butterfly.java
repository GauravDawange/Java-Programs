import java.io.*;
public class Butterfly {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Row");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter Column");
        int m = Integer.parseInt(br.readLine());


        for(int i = 1; i<n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = 1; i<=n; i++)
        {
            for(int j=i; j<=n; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
