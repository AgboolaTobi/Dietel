package PersonalAssessments;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter score(Enter -1 to stop): ");
        int score = scanner.nextInt();
        int count = 0;
        int counter = 1;
        int sum = 0;
        int average = 0;
        while (score != -1){
            if (score < 0){
                System.out.println("Enter valid score(Enter -1 to stop): ");
            }
            sum+=score;
            average = sum / counter;
            System.out.println("Enter score(Enter -1 to stop): ");
             score = scanner.nextInt();
             counter++;
            count++;
        }
        System.out.printf("""
                                            Sum of Score        average score
                Number of Students(%d)        %d (scores)             %d
                
                """,counter,sum,average);
    }
}
