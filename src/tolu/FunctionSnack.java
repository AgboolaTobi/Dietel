package tolu;

public class FunctionSnack {


    public static int commission(int percentage) {

        if (percentage < 50) {
            return percentage * 160 + 5000;
        }
        else if (percentage <= 59) {
            return percentage * 200 + 5000;
        }
        else if (percentage <= 69) {
            return percentage * 250 + 5000;
        }
        else {
            return percentage * 500 + 5000;
        }
    }

}



