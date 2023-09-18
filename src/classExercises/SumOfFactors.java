package classExercises;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int number = input.nextInt();
        int result =0;
        for (int count=1; count<= number;count++){
            if(number % count == 0){
                result = result +1;
            }
        }
        System.out.println(result);
    }
}
