package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        int year= minutes/525600;
         int day = (minutes- year*525600)/(24*60);
        System.out.printf("There are "+ year +" years, "+ day +" days");

    }

}
