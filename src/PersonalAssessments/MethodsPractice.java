package PersonalAssessments;

import java.util.Scanner;

public class MethodsPractice {
    public void smallest(int number1,int number2,int number3){
        if (number1 < number2 && number1 < number3){
            System.out.println(number1 + " is smaller than " + number2 + " and  " + number3);
        }
        else if (number2 < number1 && number2 < number3){
            System.out.println(number2 + " is smaller than " + number1 + " and " + number3);
        }
        else {
            System.out.println(number3 + " is smaller than " + number1 + " and " + number2);
        }
    }
    public static void main(String[] args) {
        MethodsPractice methodsPractice = new MethodsPractice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3: ");
        int number3 = scanner.nextInt();
        methodsPractice.smallest(number1,number2,number3);
        MethodsPractice methodsPractice1 = new MethodsPractice();
        int first = 56;
        int second = 50;
        int third = 70;
        methodsPractice1.smallest(first,second,third);

        Object object = new Object();
        int getHascode = object.hashCode();
        System.out.println(getHascode);
    }
    



}
