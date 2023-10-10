package Chapter4;

public class TaxCalculator {
    public static void main(String[] args) {

    }

    public double earning(double earning) {
        double tax = 0.15 * earning;

        if (earning > 30000){
            tax = 0.2 * earning;
        }

        return tax;
    }
}
