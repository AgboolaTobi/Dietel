package Chapter6;

public class Multiples {

    public static void main(String[] args) {
        System.out.println(isMultiple(5,39));
    }
    public static boolean isMultiple(int firstNumber,int secondNumber){
        return secondNumber % firstNumber == 0;

    }
}
