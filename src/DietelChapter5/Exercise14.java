package DietelChapter5;

public class Exercise14 {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; year++) {
            for (rate = 0.05 ; rate <= 0.1; rate = rate + 0.01 ){
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%, 20.2f%n", year, amount);

            }
        }

    }
}
