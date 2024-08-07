
package loopquestion4;

import java.util.Scanner;

public class LoopQuestion4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int power, base;
        System.out.println("Enter base");
        base = input.nextInt();
        System.out.println("Enter power");
        power = input.nextInt();
       double result;
       result =  Math.pow(base, power);
        System.out.println("The result = " + result);
    }
    
}
//معرفتش اعملها  loops 