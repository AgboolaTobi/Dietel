package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negative = 0;
        int zeros = 0;
        int positive = 0;
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        if (number1 < 0){
            negative += 1;}
        if (number1==0){
            zeros +=1;
            }
    }
}
