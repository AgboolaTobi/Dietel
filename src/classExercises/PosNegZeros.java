package classExercises;
import java.util.Scanner;

public class PosNegZeros {
    public static void main(String[] args) {
        Scanner toby = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int totalNegativeNumbers = 0;
        int totalPositiveNumber = 0;
        int totalZeros = 0;
        System.out.println("Enter first number");
        number1 = toby.nextInt();
        System.out.println("Enter second number");
        number2 = toby.nextInt();
        System.out.println("Enter third number");
        number3 = toby.nextInt();
        System.out.println("Enter fourth number");
        number4 = toby.nextInt();
        System.out.println("Enter fifth");
        number5 = toby.nextInt();

        if(number1<0)
            totalNegativeNumbers = totalNegativeNumbers + 1;

        if(number2<0)
            totalNegativeNumbers = totalNegativeNumbers +1;
        if(number3<0)
                totalNegativeNumbers = totalNegativeNumbers + 1;
        if(number4<0)
                totalNegativeNumbers = totalNegativeNumbers +1;
        if(number5<0)
                    totalNegativeNumbers = totalNegativeNumbers +1;
        if(number1==0)
                totalZeros = totalZeros+1;
        if(number2==0)
                totalZeros = totalZeros+1;
        if(number3==0)
            totalZeros = totalZeros+1;
        if(number4==0)
            totalZeros = totalZeros +1;
        if(number5==0)
            totalZeros = totalZeros +1;

        if(number1>0)
            totalPositiveNumber = totalPositiveNumber +1;
        if(number2>0)
            totalPositiveNumber = totalPositiveNumber +1;
        if(number3>0)
            totalPositiveNumber = totalPositiveNumber +1;
        if(number4>0)
            totalPositiveNumber = totalPositiveNumber +1;
        if(number5>0)
            totalNegativeNumbers = totalPositiveNumber =1;

        System.out.println();
        System.out.printf("Total number of negativeNumbers is :" , totalNegativeNumbers);
        System.out.println("Totoal number of positveNumbers is :" + totalPositiveNumber);
        System.out.println("Total number of Zeros is : " + totalZeros);


    }
}
