//package PersonalAssessments;
//
//import java.util.Scanner;
//
//public class Trial {
//
//    public static int maximum(int[] numbers) {
//        int count;
//        Scanner scanner = new Scanner(System.in);
//        for (count = 0; count < 10; count++) {
//            System.out.print("Enter the element: ");
//            numbers[count] = scanner.nextInt();
//        }
//        int largest = numbers[0];
//        for (count = 0; count < 10; count++) {
//            if (largest < numbers[count]) {
//                largest = numbers[count];
//            }
//        }
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        maximum();
//    }
//}