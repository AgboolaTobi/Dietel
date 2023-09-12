package Assignment1;

import static java.lang.Math.pow;

public class Table {
    public static void main(String[] args) {

        System.out.println("a       b       pow(a, b)");
        int power = 1;
        int result = 1;
        for (int integer =1;integer <= 5; integer+=1){

            power += 1;
            result = (int) pow(integer, power);

            System.out.printf("%d       %d        %d", integer, power, result);
            System.out.println( );


        }
    }
}
