import java.util.Arrays;

public class Equality_of_Two_Arrays {
    public static void main(String args[])
    {
        int a1[] = {1,2,3,4,5,6,7};
        int a2[] = {1,2,3,4,5,6,7};

        // Approach 1 

        // boolean status = Arrays.equals(a1,a2);

        // if(status == true)
        // {
        //     System.out.println("Arrays are equals");
        // }
        // else
        // if(status == false)
        // {
        //     System.out.println("Arrays are Not equals");
        // }

        // Approach 2

        boolean status = true;

        if(a1.length == a2.length)
        {
        for(int i = 0; i<a1.length; i++)
        {
            if(a1[i]!=a2[i])
            {
                status = false;
            }
        }
        }
             else 
            {
                 status = false;
            }

            if(status == true)
            {
                System.out.println("Arrays are equals");
            }
            else
            if(status == false)
            {
                System.out.println("Arrays are Not equals");
            }
    








    }
}
