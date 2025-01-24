//Imports Java Scanner
import java.util.Scanner;

public class Stairs{
    public static void main(String[] args){

        //Input for the character
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String c = input.nextLine();
        
        //Input for number of steps
        System.out.println("Enter number of steps: ");
        int steps = input.nextInt();
        
        //For loop that makes the stairs
        for (int i = steps; i > 0; i-- ){
            System.out.println(" ".repeat(i) + c.repeat(steps-i+1));
        }
    }
}
    
