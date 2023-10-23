package PersonalAssessments;

public class ArrayPractice7 {

    public static double minimumElement(double[] array) {
        double minimum = array[0];
        int element = 0;
        for (int count = 0; count < array.length; count++) {
            for (element = 0; element < array[element]; element++) {
                if (array[element] < minimum) {
                    minimum = array[element];
                }
            }
        }
        return array[element];
    }

    public static void main(String[] args) {
        double[] my_array = {1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2};
        System.out.println(minimumElement(my_array));
    }

}
