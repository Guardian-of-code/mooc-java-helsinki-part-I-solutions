
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int marks = Integer.parseInt(reader.nextLine());
        if(marks<30){
            System.out.println("Grade: failed");
        }
        else{
            System.out.println("Grade: "+(marks/5 - 5));
        }

    }
}
