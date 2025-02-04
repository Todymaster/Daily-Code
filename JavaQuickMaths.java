// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {
    public static void main(String args[]){
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()
        System.out.println("Looping from 1.0 to 5.0 with rounding methods:");
        for (double i = 1.0; i <= 5.0; i+=0.5 ){
            System.out.printf("Number: %.1f   Ceil: %.1f    Floor: %.1f   Rint: %.1f    Round: %d\n", i, Math.ceil(i), Math.floor(i), Math.rint(i), Math.round(i));
        }

        
        // 2. Prompt the user to enter a decimal number
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("\nEnter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.printf("Ceil: %.1f    Floor: %.1f   Rint: %.1f    Round: %d\n", Math.ceil(decimal), Math.floor(decimal), Math.rint(decimal), Math.round(decimal));
        
        
        // 3. Prompt the user to enter an integer
        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string
        System.out.print("\nEnter an integer: ");
        int number = scanner.nextInt();
        System.out.print("Enter a word: ");
        String word = scanner.next();
        
        System.out.printf("You entered integer: %d \nYou entered string: %s \n", number, word );
        
        
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        //    - Convert the decimal number to int (explicit cast) and print
        //    - Convert the integer to a char (ASCII representation) and print
        double implicit = number;
        System.out.printf("\nImplicit cast (int -> double): %.1f", implicit);
        System.out.printf("\nExplicit cast (double -> int): %d", (int)decimal);
        System.out.printf("\nCasting int to char (ASCII): %c\n", (char)number);
    
        
        // 5. Prompt the user to enter a character
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        System.out.print("\nEnter a character: ");
        char character = scanner.next().charAt(0);
        System.out.printf("ASCII value of '%c' is: %d\n", character, (int)character);
        
        
        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        System.out.println("\nString Comparisons:");
        String str1  = "Fortnite";
        String str2 = "Fortnite";
        String str3 = new String("Fortnite");
        
        System.out.printf("Str1 == Str2: %b", str1 == str2);
        System.out.printf("\nStr1 == Str3: %b", str1 == str3);
        System.out.printf("\nstr1.equals(str3): %b", str1.equals(str3));
        
        // Close the Scanner object
        scanner.close();
    }
}

