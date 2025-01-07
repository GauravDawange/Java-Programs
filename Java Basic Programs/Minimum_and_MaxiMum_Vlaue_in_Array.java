public class Minimum_and_MaxiMum_Vlaue_in_Array {
    public static void main(String[] args) {
        
        int[] numbers = {12, 34, 56, 78, 1, -9, 45, 0}; 
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
