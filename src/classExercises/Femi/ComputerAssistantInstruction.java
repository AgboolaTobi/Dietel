//package classExercises.Femi;
//
//
//// Use a secureRandom Object to produce two positive one digit integer
//// Prompt the user with a question
//// Collect user's answer to the question in step2
//// Check if users answer is correct
//// if the answer is correct display "very good!"
//// Display answer multiplication question
//// If the answer is wrong, display "please try again"
//// let the user try the question repeatedly until they get it wrong
//// NOTE: Create a method that generates each new question. The method should be called when the application starts and each time the user answers correctly
//
//import java.security.SecureRandom;
//import java.util.Scanner;
//
//public class ComputerAssistantInstruction {
//
//    private static int correctAnswer;
//    public static  int generateRandomNumber(){
//        SecureRandom secureRandom = new SecureRandom();
//        int number = secureRandom.nextInt(1, 10);
//        return number;
//    }
//
//    public static  String generateQuestion(){
////        "5 multiply by 10 = "
//        int firstNumber = 1;//generateRandomNumber();
//        int secondNumber = 7;//generateRandomNumber();
//        correctAnswer = firstNumber * secondNumber;
//        String question = firstNumber + " multiply by " + secondNumber;
//        return question;
//    }
//    public static boolean isAnswerCorrect(int number){
//        boolean isAnswerCorrect =  number == correctAnswer;
//        return isAnswerCorrect;
//    }
//    public static String createDisplay(String message){
//        String horizontalBar = "=".repeat(20);
//        String display = horizontalBar + "\n" + message + horizontalBar;
//
//        return display;
//    }
//    private  static final String WELCOME_MESSAGE = "Welcome dear friend";
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final String CORRECT_ANSWER_MESSAGE = "Very Good!";
//    private  static final String INCORRECT_ANSWER_MESSAGE = "Please try again";
//
//    public static void main(String[] args) {
//        System.out.println(createDisplay((WELCOME_MESSAGE)));
//        System.out.println(question());
//        imput();
//        while (isAnswerCorrect(answer)){
//            System.out.println(INCORRECT_ANSWER_MESSAGE);
//            System.out.println(question);
//        }
//    }
//    private static  int imput(){
//        return scanner.nextInt();
//    }
//
//}
