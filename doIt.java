//Imports scanner
import java.util.Scanner;


public class doIt{
    public static void main(String args[]){
        
        //Make new instance of scanner
        Scanner scanner = new Scanner(System.in);
        
        //Declare a variable for user input
        int userInput = 0;
        
        do{
            //Prompts the user to enter a positive number
            System.out.print("\nEnter a positive number: ");
            userInput = scanner.nextInt();
            
            //If the number the user entered is negative or is 0, it prints out an error message and prompts the user again
            if (userInput < 0){
                System.out.print("That is not a positive number. Please try again.\n ");
            }
            else if (userInput == 0){
                System.out.print("0 is not a positive.\n");
            }
        }
        while (userInput <= 0);
        
        //Displays a confirmation message
        System.out.print("You entered a number of " + userInput + ".");
        
        
        //Closes the scanner
        scanner.close();
        
    }
}
