package JavaProgramming.Chapter1;

public class Exercise13 {
    public static void main(String[] args) {

        double x = ((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1));

        double y = (3.4 * 5.9) - ((44.5 * 2.1) / (3.4 * .55)) - (50.2 * 2.1);

        System.out.printf("%.2f \n%.2f",x,y);
    }
}
