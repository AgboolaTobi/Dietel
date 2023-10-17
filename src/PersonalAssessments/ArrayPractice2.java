package PersonalAssessments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Semicolon Africa...";
        String address = "312 Albert Macaulay way, Sabo Yaba. Lagos";
        String ceo = "CEO: Sam Immanuel";
        String result = name + "\n" +address + "\n" + ceo;
        System.out.println(result);


    int [][] numbers = new int[4][3];
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++){
                System.out.println("Enter score");
                int score = input.nextInt();
                numbers[row][column] = score;
            }
            System.out.println(Arrays.deepToString(numbers));
        }
    }

}
