public class Missing_Number_in_Array {
    public static void main(String[] args) {
        int a[] = {0,1,2,3,5,10,9,8,7,6};
        int n = a.length;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i<a.length; i++)
        {
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of Element in the Array "+sum1);

        // Here is a Formula of Finding Actuall sum  in The Array

        sum2 = n*(n+1)/2;

        System.out.println("Auctall Sum of Element in the Array "+sum2);
        int missing = sum2-sum1;

        System.out.println("Missing Element in the Array "+missing);



    }
}
