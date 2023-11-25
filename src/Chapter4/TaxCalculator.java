package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of first citizen: ");
        String firstCitizen = scanner.next();

        System.out.println("Enter name of second citizen: ");
        String secondCitizen = scanner.next();

        System.out.println("Enter name of third citizen: ");
        String thirdCitizen = scanner.next();

        System.out.println("Enter first citizen's earning: ");
        double firstCitizenEarning = scanner.nextDouble();

        System.out.println("Enter second citizen's earning: ");
        double secondCitizenEarning = scanner.nextDouble();

        System.out.println("Enter third citizen's earning: ");
        double thirdCitizenEarning = scanner.nextDouble();

        double firstCitizenTaxRate = 0;
        double secondCitizenTaxRate = 0;
        double thirdCitizenTaxRate = 0;

        if (firstCitizenEarning > 0 && firstCitizenEarning <= 30000){
            firstCitizenTaxRate = ( 0.15 * firstCitizenEarning);
        }
        else if (firstCitizenEarning > 30000){
            firstCitizenTaxRate = (firstCitizenEarning  * 0.20);
        }

        if (secondCitizenEarning > 0 && secondCitizenEarning <= 30000){
            secondCitizenTaxRate = (0.15) * secondCitizenEarning;
        }
        else if (secondCitizenEarning > 30000){
            secondCitizenTaxRate = (secondCitizenEarning  * 0.20);
        }

        if (thirdCitizenEarning > 0 && thirdCitizenEarning <= 30000){
            thirdCitizenTaxRate = (0.15) * thirdCitizenEarning;
        }
        else if (thirdCitizenEarning > 30000){
            thirdCitizenTaxRate =(thirdCitizenEarning * 0.20);
        }

        double firstCitizenTotalTax = firstCitizenTaxRate;
        double secondCitizenTotalTax = secondCitizenTaxRate;
        double thirdCitizenTotalTax = thirdCitizenTaxRate;

        System.out.printf("""
                First citizen's name: $ %s
                First citizen's total tax: $ %.2f
                Second citizen's name: $ %s
                Second citizen's total tax: $ %.2f
                Third citizen's name: $ %s
                Third citizen's total tax: $ %.2f
                """,firstCitizen,firstCitizenTotalTax,secondCitizen,secondCitizenTotalTax,thirdCitizen,thirdCitizenTotalTax);
    }
}
