package PersonalAssessments;

public class Example1 {

    public static  void sum(int a, int b){
        int c;
        c = a + b ;
        System.out.println("The sum of " + a +" and " + b + " = " + c);
    }
    public static void product(int a, int b){
        int product = a*b;
        System.out.println("The product of " + a + " and " + b + " = " + product);
    }

    public static void main(String[] args) {
        sum(70, 50);
        product(5,8);
    }
}
