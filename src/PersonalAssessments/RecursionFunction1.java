package PersonalAssessments;

public class RecursionFunction1 {
    public static  int sum(int number){
        if (number > 0){
            return number + sum(number - 1);

        }
        else{
            return 0;
        }
    }

    public static int sum2(int start, int stop){
        if (stop > start){
            return stop + sum2(start, stop - 1);
        }
        else{
            return stop;
        }
    }

    public static int fibonacci(int number){
        if (number == 1 || number == 0){
            return number;
        }
        else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
