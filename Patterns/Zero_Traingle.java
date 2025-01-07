import java.io.*;
public class Zero_Traingle 
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enetr Row");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enetr Column");
        int m = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                int sum = i+j;
                if(sum %2 == 0)
                {
                    System.out.print("1");
                }
                    else
                    {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    }
    

