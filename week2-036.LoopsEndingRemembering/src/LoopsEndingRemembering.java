
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int i = 0,sum=0,count = 0,even = 0,odd = 0;
        i = Integer.parseInt(reader.nextLine());
        while (i != -1) {
            sum += i;
            count+= 1;
            if (i%2==0) {
                even += 1;
            } else {
                odd += 1;
            }
            i = Integer.parseInt(reader.nextLine());
            
            
       }
        System.out.println("Thank you and see you later!\nThe sum is " + sum);
        System.out.println("How many numbers: "+ count);
        System.out.println("Average: "+((double)sum/count));
        System.out.println("Even numbers: "+ even);
        System.out.println("Odd numbers: "+ odd);
    }
}
