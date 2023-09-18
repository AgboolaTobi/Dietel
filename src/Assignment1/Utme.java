package Assignment1;

public class Utme {

    public static int amountPerCopy(int numberOfCopy) {
        int result = 0;
        if (numberOfCopy >= 1 && numberOfCopy <= 4) {
            result =  2000 * numberOfCopy;
        }else if (numberOfCopy >=5 && numberOfCopy <= 9){
            result = 1800 * numberOfCopy;
        }else if (numberOfCopy >= 10 && numberOfCopy <=29){
            result = 1600 * numberOfCopy;
        }
        else if (numberOfCopy >=30 && numberOfCopy <= 49){
            result = 1300 * numberOfCopy;
        }
        else if (numberOfCopy >= 100 && numberOfCopy <= 199){
            result = 1200 * numberOfCopy;
        }
        else if (numberOfCopy >=200 && numberOfCopy <= 499){
            result = 1100 * numberOfCopy;
        }
        else if (numberOfCopy >= 500){
            result = 1000 * numberOfCopy;
        }
        return result;
    }
}