package classExercises;

public class LowestCommonMultiple {

    public static  int gcd(int first,int second){
        if (second==0){
            return  first;
        }
        return gcd(second,first % second);
    }

    public static int findLCM(int[] numbers){
        int lcm = numbers[0];
        for(int index = 1; index < numbers.length; index++){
            int currentNumber = numbers[index];
            lcm = (lcm * currentNumber) / gcd(lcm,currentNumber);
        }
        return lcm;
    }


    public static void main(String[] args) {
//        int[] numbers = {3,9,27};
//        int result = 3;
        System.out.println(gcd(81,1));
    }
}
