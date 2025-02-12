//Imports scanner
import java.util.Scanner;


public class funArrays {
    
    public static void array1(){
        //Declares and initializes an integer array
        int[] numbers = new int[5];
        
        //Prints array wihtout using for loop
        System.out.println("Array for task 1: ");
        System.out.println("Element 0: " + numbers[0]);
        System.out.println("Element 1: " + numbers[1]);
        System.out.println("Element 2: " + numbers[2]);
        System.out.println("Element 3: " + numbers[3]);
        System.out.println("Element 4: " + numbers[4]);
    }
    
    public static void array2(){
        //Declares and initializes an integer array
        int[] numbers = new int[5];
        
        //Assigns values to array seperately
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;
        
        //Prints array without for loop
        System.out.println("\nArray for task 2: ");
        
        System.out.println("Element 0: " + numbers[0]);
        System.out.println("Element 1: " + numbers[1]);
        System.out.println("Element 2: " + numbers[2]);
        System.out.println("Element 3: " + numbers[3]);
        System.out.println("Element 4: " + numbers[4]);
        
    }
    
    public static void array3(){
        
        //Assign values directly
        int[] numbers = {21, 12, 22, 11, 2};
        
        //Prints array without for loop
        System.out.println("\nArray for task 3: ");
        
        System.out.println("Element 0: " + numbers[0]);
        System.out.println("Element 1: " + numbers[1]);
        System.out.println("Element 2: " + numbers[2]);
        System.out.println("Element 3: " + numbers[3]);
        System.out.println("Element 4: " + numbers[4]);
        
    }
    
    public static void array4(){
        
        //Declares and initializes an integer array
        int[] numbers = new int[5];
        
        //For loop that populates the array with multiples of 3 starting 3
        for (int i = 1; i <= 5; i++){
            numbers[i-1] = i * 3;
        }
        
        //Prints array without for loop
        System.out.println("\nArray for task 4: ");
        
        System.out.println("Element 0: " + numbers[0]);
        System.out.println("Element 1: " + numbers[1]);
        System.out.println("Element 2: " + numbers[2]);
        System.out.println("Element 3: " + numbers[3]);
        System.out.println("Element 4: " + numbers[4]);
    }
    
    public static void array5(){
        
        //Declares and initializes an integer array
        char[] charArray = new char[5];
        
        //Set first element to A
        charArray[0] = 'A';
        
        //Loop to add next letters increasing by 2
        for (int i = 1; i < 5; i++){
            charArray[i] = (char)((int)charArray[i-1]+2);
        }
        
        //Prints array without for loop
        System.out.println("\nArray for task 5: ");
        
        System.out.println("Element 0: " + charArray[0]);
        System.out.println("Element 1: " + charArray[1]);
        System.out.println("Element 2: " + charArray[2]);
        System.out.println("Element 3: " + charArray[3]);
        System.out.println("Element 4: " + charArray[4]);
    }
    
    public static void array6(){
        
        //Prompts the user to enter size of array
        System.out.println("\nHow many numbers do you want in the loop:");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        
        //Creating an array of the size that the user wants
        int[] numbers = new int[index];
        
        
        System.out.println("\nArray for task 6: ");
        
        //Iterates until the end of the list
        for (int i = 0; i < index; i++){
            //Adds the random numbers into the array and prints it out
            numbers[i] = (int)(Math.random() * 100) + 1;
            System.out.println("Element " + i + ": " + numbers[i]);
        }
        
        //Closes scanner to prevent data leaks
        scanner.close();
        
    }
    public static void main(String args[]) {
        
        //Runs all the arrays
        array1();
        array2();
        array3();
        array4();
        array5();
        array6();
    }
}
