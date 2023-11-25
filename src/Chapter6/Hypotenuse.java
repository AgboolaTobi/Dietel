package Chapter6;

import static java.lang.Math.sqrt;

public class Hypotenuse {
    public static void main(String[] args) {
        System.out.println("The hypotenuse is : " + hypotenuse(3,4));
        System.out.println("The hypotenuse is : " + hypotenuse(5,12));
        System.out.println("The hypotenuse is : " + hypotenuse(8,15));
    }
    public static double hypotenuse(double side1,double side2){
        return sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }
}
