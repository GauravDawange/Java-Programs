import java.io.*;
public class Number_Pyramid {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enetr Row");
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<=n; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            for(int j=i; j<=n; j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    
}
