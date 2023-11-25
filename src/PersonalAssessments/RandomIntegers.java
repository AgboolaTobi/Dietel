package PersonalAssessments;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int counter;
        for (counter = 0; counter <= 20; counter++) {
            int faceOfDice = 1 + randomNumbers.nextInt(6);
            System.out.print("  " + faceOfDice);
            if (counter % 5 == 0){
                System.out.println();
        }

       }
    }
}
