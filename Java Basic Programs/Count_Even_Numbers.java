import java.util.*;

public class Count_Even_Numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
                System.out.println("Even Number: " + i);
            }
        }
        System.out.println("Total count of even numbers: " + count);
    }
}
