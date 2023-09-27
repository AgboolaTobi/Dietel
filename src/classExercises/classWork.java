package classExercises;

public class classWork {
    public static void main(String[] args) {

        printBox(5);
    }
    public static void printBox(int numberOfStars) {
        for(int index = 1;index <= numberOfStars; index ++){
            printStars(numberOfStars);
        }
    }

    public static void printStars(int numberOfStars){
        for(int index = 1;index <=numberOfStars;index ++){
            System.out.print("* ");
        }

        System.out.println();
    }
    public static void printLogo(int numberOfStars){
        for (int index = 1; index <= numberOfStars; index++){
            System.out.println("* * ");
        }
    }

}
