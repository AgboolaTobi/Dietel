package mrChibuzo;

import java.util.Objects;
import java.util.Scanner;

public class PizzaFunctions {

    public static int pizzaSize(){
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.println("""
                ==== Order List 
                1. Large
                2. Medium
                3. Small
                """);
        int order = input.nextInt();
        if (order == 1){
            quantity = 10;
        } else if (order == 2) {
            quantity = 6;
        }
        else {
            quantity = 4;
        }
        return quantity;
    }

    public static int quantity() {
     return   pizzaSize();
    }
}
