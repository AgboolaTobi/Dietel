import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer :");

        int number = input.nextInt();
        int square = number*number;

        System.out.printf("The square of " + number +  " " + "is" + " " + square);

    }
}
