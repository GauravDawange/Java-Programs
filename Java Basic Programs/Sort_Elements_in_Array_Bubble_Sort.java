import java.util.Arrays;
public class Sort_Elements_in_Array_Bubble_Sort 
{
        public static void main(String[] args) 
        {
            int[] numbers = {64, 95, 25, 12, 22}; 

            System.out.println("Before Arrays Sort"+Arrays.toString(numbers));

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - 1 - i; j++) 
                {
                    if (numbers[j] > numbers[j + 1]) 
                    {
                       
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
    
            
            System.out.println("After Arrays Sort"+Arrays.toString(numbers));
    }
    
}
