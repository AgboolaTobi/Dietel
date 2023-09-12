package classExercises;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        int result = 0;
        for (int count = 1; count <= number; count++) {
            result = result + 1;
            }
        if(result<2){
            System.out.println("Number is a prime number"+result);
        }
        if(result>2){
            System.out.println("Number is not a prime number");;
        }
        }
    }

