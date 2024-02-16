package PersonalAssessments.ArrayRevision;

public class Largest {


    public static  int theLargest(int[] array){
        int maximum = array[0];
        for (int i : array) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return  maximum;
    }

    public static void main(String[] args) {
        int [] given = {1,2,3,4,5,8,2,2,2,5};
        System.out.println(theLargest(given));
    }
}
