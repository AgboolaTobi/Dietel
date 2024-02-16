package classExercises.Femi;

public class Jonathan2024 {


    public static int NotDuplicated(int[] array) {
        int element = 0;
        int result = 0;
        for (int length = 0; length < array.length; length++) {
            for (int check = 0; check < array.length; check++) {
                if (array[check] == array[length]) {
                    element ++;
                }
            }
            if (element==1){
                result = array[length];
            }
            element=0;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] array = {2,2,1,3,3};
        System.out.println(NotDuplicated(array));
    }
}
