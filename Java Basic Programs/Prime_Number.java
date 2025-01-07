import java.util.*;
public class Prime_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        int count = 0;
        System.out.println("Enetr a Number");
        int num =  sc.nextInt();

        if(num>1)
        {
            for(int i = 1; i<=num; i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println("The Give Number is Prime Number");
            }
            else 
            {
                System.out.println("The Give Number is Not Prime");
            }
        }

    }
    
}
