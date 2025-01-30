//Imports the scanner 
import java.util.Scanner;

public class Factorial {
  //Function to calculate the factorial
  static void Calc_Factorial(){
      //Takes the number from the user
      Scanner scanner = new Scanner(System.in);
      System.out.print("What is the number that you want to factorial?: ");
      int x = scanner.nextInt();
    
      //Makes sure the user enters a non-negative number
      while (x < 0){
         System.out.print("Enter a positive number please!: ");
         x = scanner.nextInt();
      }
      long factorial = 1;
      
      //Calculates the factorial using a for loop
      for (int i = x; i > 0; i--){
          factorial *= i;
      }      
    
      //Prints out the answer
      System.out.printf("The factorial of %d is %d.", x, factorial);
      
      //Closes the scanner to avoid data leaks
      scanner.close();
  }    
  
  public static void main(String args[]) {
    //Runs the function to calculate the factorial
    Calc_Factorial();
  }
  
}
