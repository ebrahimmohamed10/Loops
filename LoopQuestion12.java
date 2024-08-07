
package loopquestion12;

import java.util.Scanner;

public class LoopQuestion12 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum =0,count=0;
        System.out.println("Enter the number");
        number = input.nextInt();
        for (int i = 1; i <=number ; i++) {
            if(number%2==0)
                sum+=number;
           
        }
        System.out.println("result = " + sum);
    }
    
}
