public class Searching_Element_in_Array_Binary_Search 
{
        public static void main(String[] args) 
    {
            int[] numbers = {10, 20, 30, 40, 50}; 
            int searchElement = 30; 
    
            int left = 0;
            int right = numbers.length - 1;
            boolean found = false;
    
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (numbers[mid] == searchElement) 
                {
                    System.out.println("Element " + searchElement + " found at index " + mid);
                    found = true;
                    break;
                } else if (numbers[mid] < searchElement) 
                {
                    left = mid + 1;
                } else {
                    right = mid - 1; 
                }
            }
    
            if (!found) {
                System.out.println("Element " + searchElement + " not found in the array.");
            }
        }
    }
    