package classExercises;
import java.util.Scanner;
public class NumberToWord {
    public static void main(String[] args) {
        Scanner toby = new Scanner(System.in);
        System.out.print("Enter a number:");
        int userInput = toby.nextInt();
        if(userInput ==1) System.out.println("One");
        if(userInput ==2) System.out.println("Two");
        if(userInput==3) System.out.println("Three");
        if(userInput==4) System.out.println("Four");
        if(userInput==5) System.out.println("Five");
        if(userInput==6) System.out.println("Six");
        if (userInput ==7) System.out.println("Seven");
        if(userInput == 8) System.out.println("Eight");
        if(userInput == 9) System.out.println("Nine");
        if(userInput ==10) System.out.println("Ten");
    }
}
