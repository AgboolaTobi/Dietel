package classExercises.Femi;

public class IntegerCounter {

    public static int countInt(String[] array){

        int store = 0;
        for (int counter = 0; counter < array.length; counter++) {
            for (int count = 0; count <array[counter].length() ; count++) {
             if (array[counter].charAt(count) == '0' || array[counter].charAt(count) == '1' || array[counter].charAt(count) == '2' ||array[counter].charAt(count) == '3' || array[counter].charAt(count) == '4' || array[counter].charAt(count) == '5' || array[counter].charAt(count) == '6' || array[counter].charAt(count) == '7' || array[counter].charAt(count) =='8' || array[counter].charAt(count) == '9'){
                 store++;
                }

            }
        }
        return store;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"array234"};
        System.out.println(countInt(array));
    }


}