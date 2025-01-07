import java.util.*;
public class Reverse_String {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");

        String str = sc.next();
        String rev ="";
        String org_str = str;
        int len = str.length();

        for(int i= len-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
    }
    
}
