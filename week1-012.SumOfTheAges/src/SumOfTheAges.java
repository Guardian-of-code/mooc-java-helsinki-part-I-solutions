
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i=0;
        int age[]={0,0};
        String name[] = {"",""};
        // Implement your program here
        while(i<2){
            
            System.out.print("Type your name: ");
            name[i] = reader.nextLine();
            System.out.print("Type your age: ");
            age[i] = Integer.parseInt(reader.nextLine());
            i+=1;      
        }
        System.out.println(name[0]+" and "+ name[1]+" are "+(age[0]+age[1])+" years old in total.");
    }
}
