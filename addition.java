//Imports scanner and random
import java.util.Scanner;
import java.util.Random;

public class addition{
    public static void main(String args[]){
        
        //Make new instances of random and scanner
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        
        //Gets 2 random numbers and ands them together
        int number1 = random.nextInt(9);
        int number2 = random.nextInt(9);
        int answer = number1 + number2;
        
        //Asks the user what adding the 2 numbers is equal to
        System.out.print("What is " + number1 + " + " + number2 + "?: " );
        int userInput = scanner.nextInt();
        
        //Keeps asking the user if the user inputs the wrong answer
        while (userInput != answer){
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?: ");
            userInput = scanner.nextInt();
        }
        
        //Prints out 
        System.out.print("You got answer! Great Job!");
        
        //Closes the scanner
        scanner.close();
        
    }
}
