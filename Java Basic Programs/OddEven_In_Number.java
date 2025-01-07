import java.util.*;
class OddEven_In_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int Even_Count = 0;
        int Odd_Count = 0;

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        while(num>0)
        {
            int rem = num%10;

            if(rem%2==0)
            {

                System.out.println(rem+" Even Numbers");
                Even_Count++;
            }
            else
            if(rem%2!=0)
            {
                System.out.println(rem+" Odd Numbers");
                Odd_Count++;
            }
            num = num/10;
        }
        System.out.println(Even_Count+" Total Even Numbers in Number");
        System.out.println(Odd_Count+" Total Odd Numbers in Number");

    }

    
}