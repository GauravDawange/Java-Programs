import java.util.*;
public class Find_Largest_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
          
        System.out.println("Enter a Value of A Number");
        a = sc.nextInt();

        System.out.println("Enter a Value of B Number");
        b = sc.nextInt();

        System.out.println("Enter a Value of C Number");
        c = sc.nextInt();

        if(a>b)
        {
            System.out.println("A is Largest Number "+a);
        }

        else
        if(a<b)
        {
            System.out.println("B is Largest Number"+b);
        }

        else

        if(a<c)
        {
            System.out.println("C is Largest Number"+c);
        }

        else
        if(a>c)
        {
            System.out.println("A is Largest Number"+a);
        }

        else
        if(c>b)
        {
            System.out.println("C is Largest Number"+c);
        }

        else
        if(c<b)
        {
            System.out.println("B is Largest Number"+b);
        }
    }
    
}
