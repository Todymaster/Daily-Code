//Imports the scanner from the java library
import java.util.Scanner;

public class count_Down {
    //Method to countdown
    static void countDown(){
      //Makes a new scanner method
      Scanner scanner = new Scanner(System.in);
      
      //Makes sure that the user enter a number and if they don't, it writes an error message and the code ends
      try {
         
          //Asks the user for number
          System.out.print("Enter a positive number?: ");
          int num = scanner.nextInt();
          
          //Counts the number backwards and prints it in each line
          for (int i = num; i >= 0; i--){
              System.out.println(i);
         }

      } catch (Exception e){
          
          System.out.println("Enter a real number!!");
          
      }
    
      //Closes the scanner so there are no data leaks
      scanner.close();
    
  }
  
   public static void main(String args[]) {
       //Run the method for the countdown
       countDown();
   }
   
    
}
