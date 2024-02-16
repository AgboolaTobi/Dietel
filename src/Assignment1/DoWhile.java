package Assignment1;

import java.util.Scanner;

public class DoWhile {



    public  static double average(int ...numbers){

        double theAverage;
        int total = 0;
        int count = 0;
        for (int number: numbers){
            total += number;
            count++;
        }

        theAverage = (double) total / count;

        return theAverage;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;
        int count = 0;
//        System.out.println("Do you wish to continue: ");
        String response = scanner.next();
        while (!response.equalsIgnoreCase("NO")){
            System.out.println("Enter input: ");
            int number = scanner.nextInt();
            System.out.println("Do you wish to continue: ");
            response = scanner.next();

            sum += number;
            count++;
        }
        average = (double) sum / count;

        System.out.println("The average = " + average);

//


    }
}
