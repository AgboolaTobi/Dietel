package mrChibuzo;

import java.util.Scanner;

public class NewPizzaApp {
    public static int pizzaSize(int order){
        System.out.println("""
                ==== Kindly Choose Your Preferred Box Size
                1. Large sized box
                2. Medium sized box
                3. Small sized box
                """);
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if (size == 1){
            size = 10;
        }
        else if (size == 2){
            size = 6;
        }
        else if (size == 3){
            size = 4;
        }
        return size;


    }
}
