package PersonalAssessments;

import java.util.Scanner;

public class GreaterCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter secondNumber: ");
        int secondNumber = scanner.nextInt();
        System.out.println(greatDivisor(firstNumber,secondNumber));
    }
    public static int greatDivisor(int firstNumber, int secondNumber){
        int divisor = 1;
        int checker = 2;
        while (checker <= firstNumber && checker <= secondNumber){
            if (firstNumber % checker == 0 && secondNumber % checker == 0)
                divisor = checker;
            checker++;


        }
        return  divisor;
    }
}
