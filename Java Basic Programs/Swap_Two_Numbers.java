public class Swap_Two_Numbers {

    public static void main(String args[])
    {
        int a=10, b=20;

        // There are Five method we are use to swap two numbers

        /*  1) Logic

        System.out.println("Before Swaping two numbers a = "+a+ " b = "+b);
        int temp = a;
        a=b;
        b=temp;

        System.out.println("After Swaping two numbers a = "+a+ " b = "+b);
            */

        /*  2) Logic 

        System.out.println("Before Swaping two numbers a = "+a+ " b = "+b);

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After Swaping two numbers a = "+a+ " b = "+b);

        */

        /*  3) Logic

        System.out.println("Before Swaping two numbers a = "+a+ " b = "+b);

        a= a*b;
        b= a/b;
        a= a/b;
        System.out.println("After Swaping two numbers a = "+a+ " b = "+b);

    
        */

        // 4) Logic

        System.out.println("Before Swaping two numbers a = "+a+ " b = "+b);

        a= a^b;
        b= a^b;
        a= a^b;
        System.out.println("After Swaping two numbers a = "+a+ " b = "+b);
        
    }

    
    
    
}
