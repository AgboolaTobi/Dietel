package PersonalAssessments;

public class nested {
    public static void main(String[] args) {
        int counter;
        int result;
        for (int count = 0; count < 10; count++) {
            result = 1;
            counter = count;
            while(counter > 0) {
                result = result * 5;
                counter--;
            }
            System.out.println("5 to the " + count + " power is " + result);
        }
    }

}