
package loopquestion11;

import java.util.Scanner;

public class LoopQuestion11 {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
         int number,count = 0;
     System.out.print("Enter the number ");
        number =input.nextInt();
        
        
        while (number != 0) {
            number /= 10;
            count++;
        }
        
        System.out.println("Number of digits: " + count);
    }
    
}
