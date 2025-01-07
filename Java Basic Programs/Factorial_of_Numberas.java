import java.util.*;
public class Factorial_of_Numberas
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number you want to find Factorial");
        int num = sc.nextInt();
        int factorial = 1;

        // either we can find Using Ascending order or Descending order

        // for(int i = 1; i<=num; i++)
        // {
        //     factorial =  factorial*i;
            
        // }
        // System.out.println(factorial);



        for(int i = num; i>=1; i--)
        {
            factorial =  factorial*i;
            
        }
        System.out.println(factorial);
    }
}