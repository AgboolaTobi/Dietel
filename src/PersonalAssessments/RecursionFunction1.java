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
}
