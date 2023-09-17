package classExercises;

public class DispatchRider {
    public static void main(String[] args) {


        printPay(55);


    }

    public static void printPay(int numberOfSuccessfulDeliveries) {
        int basePay = 5000;
        int totalNumberOfPackages = 100;
        int result = 0;
        for (numberOfSuccessfulDeliveries = 0; numberOfSuccessfulDeliveries <= totalNumberOfPackages; numberOfSuccessfulDeliveries++) {

            if (numberOfSuccessfulDeliveries >= 70) {
                int amountPerParcel = 500;
                result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;

            } else if (numberOfSuccessfulDeliveries > 59 || numberOfSuccessfulDeliveries <= 69) {
                int amountPerParcel = 250;
                result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;

            } else if (numberOfSuccessfulDeliveries >= 50 || numberOfSuccessfulDeliveries <= 59) {
                int amountPerParcel = 200;
                result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;

            } else if (numberOfSuccessfulDeliveries < 50) {
                int amountPerParcel = 160;
                result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;

            }
            System.out.println(result);
        }
//    public  static void printPay2(int numberOfSuccessfulDeliveries){
//        int basePay = 5000;
//        int amountPerParcel = 250;
//        int result = 0;
//        for (int totolNumberOfPackages = 60; totolNumberOfPackages <= 69; totolNumberOfPackages++){
//            result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;
//        }
//        System.out.println(result);
//    }
    }

}