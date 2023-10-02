package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        int count;
        String caster;
        String result = " ";
        for (count = 1; count <= 10; count++) {
            System.out.print("Enter score:");
            score = scanner.nextInt();
            caster = String.valueOf(score);
            result = result + " " + caster;
        }
        System.out.print(" The scores are:" + "[" + result + " ]");

    }
}