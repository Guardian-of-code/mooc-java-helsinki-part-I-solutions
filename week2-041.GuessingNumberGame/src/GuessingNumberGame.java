
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        System.out.print("Guess a number: ");
        int numberGuessed = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (guess( numberGuessed, numberDrawn, i )) {            
        System.out.print("Guess a number: ");
        numberGuessed = Integer.parseInt(reader.nextLine());
        i++;
        
        }
        
        // program your solution here. Do not touch the above lines!
        
    }

    /**
     *
     * @param numberGuessed
     */
    public static boolean guess(int numberGuessed, int numberDrawn, int i){
        
        if (numberGuessed > numberDrawn) {
            System.out.println("The number is lesser, guesses made: "+i);
            return true;
        } else if (numberGuessed < numberDrawn){
            System.out.println("The number is greater, guesses made: "+i);
             return true;
        }
        else {
            System.out.println("Congratulations, your guess is correct!");
            return false;
        }
        
    
    }
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
