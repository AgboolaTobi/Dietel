package PersonalAssessments;

public class Factorial {
    public static void main(String[] args) {

    }

    public int factorials(int count){
        int facto = 1 ;
        for (count = 1 ; count <= 5 ; count++) {

            facto = facto * count;

        }
        return facto;
    }
}
