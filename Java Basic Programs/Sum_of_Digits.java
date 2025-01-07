import java.util.*;
public class Sum_of_Digits {
    
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number when you want to Calculate Sum");
            int num = sc.nextInt();

            int org_num = num;

            int sum =0;
            int rem;
            while(num>0)
            {
                rem = num%10;
                sum = sum+rem;
                num = num/10;
            }
            
            System.out.println("The Sum of "+org_num+" is "+sum);
            

        }
    }
    

