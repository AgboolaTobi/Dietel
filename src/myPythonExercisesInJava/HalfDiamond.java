package myPythonExercisesInJava;

public class HalfDiamond {
    public static void main(String[] args) {
        int i ;
        int j ;
        for (i = 0; i <= 5; i++) {
            for (j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 0; i <= 5; i++) {
            for (j = 5; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//for (i = 0 ; i + 1 < 0 ; i--){
//        for (j = 0 ; j <= 0 ; i--) {
//        System.out.println("#");
//        }
//        System.out.println();
//        }
//        }