package classExercises;


import java.util.Scanner;
public class AverageAcceleration {
    public static void main(String[] args){
        Scanner toby = new Scanner(System.in);
        System.out.print("Enter initialVelocity v0: ");
        double initialVelocity = toby.nextDouble();

        System.out.print("Enter finalVelocity: ");
        double finalVelocity = toby.nextDouble();

        System.out.print("Enter time t :");
        double time = toby.nextDouble();

        double averageAcceleration = (finalVelocity-initialVelocity)/time;

        System.out.printf("The averageAcceleration is" + " " + "%.3f" , averageAcceleration);

    }
}
