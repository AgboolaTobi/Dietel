package Assignment1;

public class Rider {
    public static void main(String[] args) {
        printPay1(60);
    }

    public static void printPay1(int numberOfSuccessfulDeliveries) {
        int basePay = 5000;
        int result = 0;
        int amountPerParcel = 500;
        for (numberOfSuccessfulDeliveries = 70; numberOfSuccessfulDeliveries<= 100; numberOfSuccessfulDeliveries++) {
           result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;
        }
        System.out.println(result);
    }

    public static void printPay2(int numberOfSuccessfulDeliveries) {
        int basePay = 5000;
        int totolNumberOfPackages = 60;
        int result = 0;
        int amountPerParcel = 250;
        for (totolNumberOfPackages = 60; totolNumberOfPackages<= 69; totolNumberOfPackages++) {
            result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;
        }
        System.out.println(result);

    }
    public static void printPay3(int numberOfSuccessfulDeliveries) {
        int basePay = 5000;
        int totolNumberOfPackages = 50;
        int result = 0;
        int amountPerParcel = 200;
        for (totolNumberOfPackages = 50; totolNumberOfPackages<= 59; totolNumberOfPackages++) {
            result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;
        }
        System.out.println(result);

    }

    public static void printPay4(int numberOfSuccessfulDeliveries) {
        int basePay = 5000;
        int totolNumberOfPackages =0;
        int result = 0;
        int amountPerParcel = 160;
        for (totolNumberOfPackages = 0; totolNumberOfPackages< 50; totolNumberOfPackages++) {
            result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;
        }
        System.out.println(result);
    }
}
