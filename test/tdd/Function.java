package tdd;

public class Function {
    public static int squareRoot(int number) {
        int result = 0;
        if (number > 0) {
            for (int factor = 1; factor < number; factor++) {
                if (factor * factor == number) {
                    result = factor;
                }
            }
        }
        return result;
    }
}
