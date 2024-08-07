
package loopquestion9;

import java.util.Scanner;

public class LoopQuestion9 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count = 1;   
      float  number, average, sum = 0;   
          
      System.out.println("Enter the value of n");  
      n = input.nextInt();  
      while (count <= n)   
             {   
                  System.out.println("Enter the "+count+" number?");  
                  number = input.nextInt();  
                  sum += number;   
                  ++count;   
             }   
                  average = sum/n;   
        System.out.println("The Average is"+average);  
}

}