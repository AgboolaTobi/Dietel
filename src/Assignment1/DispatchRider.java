package Assignment1;

public class DispatchRider {
    public static void main(String[] args) {

    }

        public static void printPay(int numberOfSuccessfulDeliveries){
            int basePay = 5000;
            int result = 0;

            if ( numberOfSuccessfulDeliveries >= 70 && (numberOfSuccessfulDeliveries <= 100))  result = numberOfSuccessfulDeliveries * 500 + basePay;


            if ( numberOfSuccessfulDeliveries >= 60 && (numberOfSuccessfulDeliveries <= 69))  result = numberOfSuccessfulDeliveries * 250 + basePay;


            if ( numberOfSuccessfulDeliveries >= 50 && (numberOfSuccessfulDeliveries <= 59))  result = numberOfSuccessfulDeliveries * 200 + basePay;


            if ( numberOfSuccessfulDeliveries >= 0  && (numberOfSuccessfulDeliveries <= 50))  result = numberOfSuccessfulDeliveries * 160 + basePay;

            System.out.println(result);
        }


}
