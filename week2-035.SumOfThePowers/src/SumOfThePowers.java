
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        double num = Double.parseDouble(reader.nextLine());
        int i = 0, sum = 0;
        while (i <= num) {
            sum += Math.pow(2, i);
            i++;
        }
        System.out.println("The result is " + sum );
      
    
        
        

    }
}
