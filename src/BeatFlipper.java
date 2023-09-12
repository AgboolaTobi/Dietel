import java.util.Scanner;

public class BeatFlipper {

    public static void main(String[] args) {

        Scanner keyboardInput =  new Scanner(System.in);

        System.out.print("Enter 0 or 1: ");

    int userInput = keyboardInput.nextInt();
    if(userInput == 0) System.out.println(1);
    if(userInput == 1) System.out.println(0);

    }
}
