public class Extract_Even_and_Odd_Numbers_in_Array {
    public static void main(String args[])
    {
        int a[] = {8,7,6,5,4,3,2,1};
        int len = a.length;

        int even = 0;
        int odd = 0;

        for(int i = 0; i<len-1; i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(" Even Numbers "+a[i]);
                even++;
                
            }
        }

        for(int i = 0; i<len-1; i++)
        {
           if(a[i]%2!=0)
            {
                System.out.println("Odd Number "+a[i]);
                odd++;
            }
        }
        System.out.println("Total Even Numbers "+even);
        System.out.println("Total Odd Numbers "+odd);

    }
    
}
