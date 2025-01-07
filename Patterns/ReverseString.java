package Patterns;
import java.util.*;
class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String when you want to Reverse");
        String str = sc.nextLine();

        String rev ="";
        int len = str.length();

        for( int i = len-1; i>=0; i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println(" After Reverse a String "+rev );
        
    }
}