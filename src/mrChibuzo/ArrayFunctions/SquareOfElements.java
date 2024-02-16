package mrChibuzo.ArrayFunctions;

public class SquareOfElements {


    public static int[] squareOfElements(int[] givenArray){

        for (int count = 0; count < givenArray.length; count++){
            for (int counter = count + 1; counter < givenArray.length; counter++){
                if (givenArray[counter] < givenArray[count]){
                    int store = givenArray[count];
                    givenArray[count] = givenArray[counter];
                    givenArray[counter] = store;
                }
            }
        }
        for (int count = 0; count < givenArray.length; count++){
            givenArray[count] *= givenArray[count];
        }
        return  givenArray;
    }
}
