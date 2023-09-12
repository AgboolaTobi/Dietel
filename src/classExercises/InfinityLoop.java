package classExercises;

public class InfinityLoop {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 5 ; counter++){
            for (int let = counter ; let <= 5 ; let --){
                System.out.print("  ");
            }
            for (int line = 1; line <= counter -1; line+=1)
            System.out.println("* ");
            }
            System.out.println(" ");
    }
}
