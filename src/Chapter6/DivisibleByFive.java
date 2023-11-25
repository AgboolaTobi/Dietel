package Chapter6;

public class DivisibleByFive {

    public static void main(String[] args) {
        System.out.println(isDivisible(6));
    }
    public static boolean isDivisible(int number){
        return number % 5 == 0;
    }

}
