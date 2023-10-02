package mrChibuzo.ClassTasks;


public class Task4 {
    public static void main(String[] args) {

        int sumOfEven = 0;

        for (int count = 1; count <= 10 ; count++){
            if (count % 2 == 0){
                sumOfEven = sumOfEven + count;
            }
        }
        System.out.println("The sum of the even numbers between 1 and 10 = " + sumOfEven);
    }
}
