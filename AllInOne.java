//Imports scanner
import java.util.Scanner;

public class AllInOne {
    public static void processNumbers(int num1, int num2, int num3) {
        
        //Calls all the method and assigns them to variables
        int sum = sumNumber(num1, num2, num3);
        int max = maxNumber(num1, num2, num3);
        int min = minNumber(num1, num2, num3);
        double average = averageNumber(sum);
        boolean allPositive = positive(num1, num2, num3);
        
        //Calls the print result method to print everything
        printResult(sum, max, min, average, allPositive, num1, num2, num3);
    }
        
    public static void printResult(int sum, int max, int min, double average, boolean allPositive, int num1, int num2, int num3){
        
        // Print results
        System.out.println("\nSum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
    
    public static void getUserInput(){
        
        //Make new scanner
        Scanner scanner = new Scanner(System.in);
        
        //Prompts the user
        System.out.println("Please enter 3 integers to calculate the sum, the max, the min, the average, and to check if all numbers are positive.");
        
        //Asks the user for 3 numbers and if they enter a non-integer it writes an error message and then the code ends
        try{
            System.out.print("\nEnter integer 1: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter integer 2: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter integer 3: ");
            int num3 = scanner.nextInt();
            
            System.out.println(" ");
            
            //Calls the process number function to do all the calculations
            processNumbers(num1, num2, num3);
            
        }
        catch (Exception e){
            System.out.println("Please enter an integer next time!!!");
        }
        
        //Close scanner
        scanner.close();
        
    }
    
    public static int sumNumber(int num1, int num2, int num3){
        // Calculate sum
        int sum = num1 + num2 + num3;
        return sum;
    }
    
    public static int maxNumber(int num1, int num2, int num3){
        // Find max
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    
    public static int minNumber(int num1, int num2, int num3){
         // Find min
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
    
    public static double averageNumber(int sum){
        // Calculate average
        double average = sum / 3.0;
        return average;
    }
    
    public static boolean positive(int num1, int num2, int num3){
        // Check if all numbers are positive
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }
 
    
    public static void main(String[] args) {
        //Call getuserinput method
        getUserInput();
    }
}
