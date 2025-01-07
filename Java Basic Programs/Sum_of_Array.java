public class Sum_of_Array {
    public static void main(String args[])
    {
        int a[] = {7,6,5,4,3,2,1};
        int sum = 0;
        
        // Approach 1

        for(int i = 0; i<=a.length-1; i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);

        // Approach 2

        // for(int Value : a)
        // {
        //     sum = sum + Value;
        // }
        // System.out.println(sum);
        

    }
}
