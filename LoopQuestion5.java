
package loopquestion5;

import java.util.Scanner;

public class LoopQuestion5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number = input.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial = i*factorial;
            
        }
         System.out.println("The result = " + factorial);
    }
    
}
