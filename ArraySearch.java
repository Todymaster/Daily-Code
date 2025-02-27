//Necessary imports go here
import java.util.Scanner; 
import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        
        //Makes new instance of scanner class
        Scanner scanner = new Scanner(System.in);
        
        //Make new variables
        int size = 0;
        int target = 0;
        
        //Get array size from user using Scanner
        //Validate input to ensure a positive integer for array size
        do{
            System.out.print("Input a positive integer for the size of the array: ");
            size = scanner.nextInt();
        } while (size < 1);
        
        //Create an array of the specified size 
        int[] array = new int[size];
    
    
        //Fill array with random numbers
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 1000 + 1);
        }
        
        //Get target number from user using Scanner
        //Validate input to ensure a positive integer for the target number if found
        do{
            System.out.print("Input a positive integer for the target: ");
            target = scanner.nextInt();
        } while (target < 1);
        
        //Linear Search
        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();
        int targetIndex = LinearSearch(array, target);
        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");
        
        
        //Print linear search result
        if (targetIndex == 0){
            System.out.println("Linear search index: " + targetIndex);
        }
        else{
            System.out.println("Linear search index: Not found");
        }

        // Sort the array using built-in method of the Arrays class
        System.out.println("Sorting the array...");
        
        
        //Sort the array as specified above
        java.util.Arrays.sort(array);
        for (int i = 0; i < size; i++){
        }

        // Binary Search
        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();
        int targetIndex2 = BinarySearch(array, target);
        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");
        
        //Print binary search result
        if (targetIndex == 0){
            System.out.println("Binary search index: " + targetIndex2);
        }
        else{
            System.out.println("Binary search index: Not found" );
        }
        
        //Print which search method was faster
        if ((linearEndTime - linearStartTime) > (binaryEndTime - binaryStartTime)){
            System.out.println("Binary search index was faster by " + ((linearEndTime - linearStartTime) - (binaryEndTime - binaryStartTime)) + " nanoseconds.");
        }
        else{
            System.out.println("Linear search index was faster by " + ((binaryEndTime - binaryStartTime) - (linearEndTime - linearStartTime)) + " nanoseconds.");
        }
        
    }
    
    public static int LinearSearch(int[] array, int target){
        
        int targetIndex = 0;
        
        //Linear search to find the index of the target number
        for (int i = 0; i < array.length; i++){
            if (target == array[i]){
                targetIndex = i;
                break;
            }
            else{
                targetIndex = -1;
            }
        }
        
        //Returning target index
        return targetIndex;
    }
        
    public static int BinarySearch(int[] array, int target){
        //Binary search to find the index of the target number if found, -1 if not
        int targetIndex2 = java.util.Arrays.binarySearch(array, target);
        return targetIndex2;
    }

    
}
