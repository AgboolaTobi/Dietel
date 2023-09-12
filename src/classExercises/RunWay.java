package classExercises;

import java.util.Scanner;
public class RunWay {
    public static void main(String[] args) {
        Scanner awoso = new Scanner(System.in);
        System.out.println("Enter the take-off speed, v: ");
        double speed = awoso.nextDouble();
        System.out.print("Enter the acceleration, a: ");
        double acceleration = awoso.nextDouble();
        double runWayLength = (speed*speed)/(2*acceleration);
        System.out.printf("The runWay length is : " + "%.3f",runWayLength);
    }

}
