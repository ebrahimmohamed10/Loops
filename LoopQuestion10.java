
package loopquestion10;

import java.util.Scanner;

public class LoopQuestion10 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       int number,  sum = 0; 
       System.out.println("Enter the number ");  
       number = input.nextInt();
       while(number!=0)
       {
            sum+=number%10;
           number = number/10;
           
       }
       System.out.println("sum of digits = " + sum);
    }
    
}
