import java.io.*;
public class Inverted_Half_Pyramid_With_No 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter row");
        int n  = Integer.parseInt(br.readLine());

        System.out.println("Enter Column");
        int m = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<=n; i++)
        {
            int k= 1;
            for(int j = n; j>=i; j--)
            {
                
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        
        
    }
}
