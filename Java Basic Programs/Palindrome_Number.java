import java.util.*;

class Palindrome_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int org_num = num;

        int rev = 0;
         while(num!=0)
         {
            rev = rev*10 + num%10;
            num = num/10;

         } 

         if(org_num==(rev))
         {
            System.out.println(" Number is Palindrome");
         }

         else
         {
            System.out.println("Number is Not Palindrome");
         }


    }
}