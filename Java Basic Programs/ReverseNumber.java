import java.util.*;
public class ReverseNumber {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Revese a Number");
        int num = sc.nextInt();
       /*  int rev = 0;
        while(num !=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("After Reverse a Number "+rev);
        */
    
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("After Reverse a Number "+rev);

    }
    
}
