public class Duplicate_Elements_in_Array 
{
    public static void main(String args[])
    {
        String a[] = { "java", "python", "java", "javasript" };
        boolean flag = false;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j]) 
                {
                    System.out.println("Duplicate Element Found in The Given Array " + a[i]);
                    flag = true;
                }
            }
        }
        if(flag ==false)
        {
            System.out.println("Duplicate Element Not Found in The Given Array ");
        }
    }
}
