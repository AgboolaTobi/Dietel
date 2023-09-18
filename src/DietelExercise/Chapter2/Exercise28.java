package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius:");

        double radius;
        radius = input.nextDouble();
        double diameter = 2 * radius;
        double circumference = (2 * 22/7 * radius);
        double area= (22/7 * radius * radius);
        System.out.println("Diameter of the circle = " + diameter);
        System.out.printf("Circumference of the circle = " + "%.2f" , circumference);

        System.out.printf("%n Area of the circle = " + "%.3f" , area);
    }
}
