package classExercises;

import java.util.Scanner;

public class Jonathan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a weekDay between 0 and 6");
        int weekDay = input.nextInt();

        while (weekDay > 6) {

            System.out.println("Enter a weekDay between 0 and 6");
            weekDay = input.nextInt();

        }

            switch (weekDay) {
                case 0 -> System.out.println("Sunday");
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
            }
        }
    }
