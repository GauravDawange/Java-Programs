import java.util.*;
public class Inverted_Half_Pyramid {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr a row");
        int n= sc.nextInt();

        System.out.println("Enter column");
        int m = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=m; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
