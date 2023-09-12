package classExercises;

public class Jonathan {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int store = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber;
        System.out.println(store);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);


    }
}
