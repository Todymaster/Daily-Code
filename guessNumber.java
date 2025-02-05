//Imports scanner and random
import java.util.Scanner;
import java.util.Random;

public class guessNumber{
    public static void main(String args[]){

        //Make new instances of random and scanner
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        //Gets random number
        int number = random.nextInt(100);
        
        //Prompts the user to start the guessing
        System.out.print("Guess a magic number between 0 and 100");
        
        // Repeat until the correct guess is made
        while (true){
            System.out.print("\n\nEnter your Guess: ");
            int userInput = scanner.nextInt();
            
            //If the guess is correct, it ends the code
            if (userInput == number){
                System.out.print("Congratulations, you have guessed the number!");
                break;
            }
            //If guess is too high or too low, it prompts the uesr again
            else if (userInput >= number){
                System.out.print("Your guess is too high! Please try again.");
            }
            else{
                System.out.print("Your guess is too low! Please try again.");
            }
            
        }
     
        //Closes the scanner
        scanner.close();
        
    }
}
