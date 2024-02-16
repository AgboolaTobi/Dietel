package Assignment1;

public class HighestOccurrence {

    public static int highestOccurrence(int[] inputArray) {
        int counter = 0;
        int secondCounter = 0 ;
        int result = 0;
        for (int firstLoop : inputArray) {
            for (int secondLoop : inputArray) {
                if (firstLoop == secondLoop) {
                    counter++;
                }
            }
            if (counter > secondCounter) {
                result = firstLoop;
            }
            secondCounter = counter;
            counter = 0;
        }
        return result;
    }
}
