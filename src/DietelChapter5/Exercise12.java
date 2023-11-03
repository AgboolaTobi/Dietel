package DietelChapter5;

public class Exercise12 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 30; number ++){
            if (number % 3 == 0){
                sum += number;
            }
        }
        System.out.println("The sum of integers between 1 and 30 that are divisible by 3 is: " + sum);
    }
}
