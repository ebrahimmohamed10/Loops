
package loopquestion8;


public class LoopQuestion8 {

    
    public static void main(String[] args) {
       int number =1;
        for (int i = 1; i <= 15; i++) {
            if(i%2 !=0)
                
                number*=i;
        }
         System.out.println("Result = " + number);
    }
    
}
