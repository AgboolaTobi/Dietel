package Functions;

public class Function1 {

    public static void main(String[] args) {
        System.out.println(isSquare(25));

    }
    public static void sayHello(){
        System.out.println("Hello World !");
    }
    public static int addNumbers(int number1, int number2){
        return number1 + number2;
    }
    public static boolean isSquare(int integer){
        for (int count = 1; count <= integer ; count++){
            if (integer / count == count){
                return true;
            }
        }
        return false;

    }
}
