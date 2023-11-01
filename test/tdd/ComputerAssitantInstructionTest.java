//package tdd;
//
//import org.junit.jupiter.api.Test;
//
//import static classExercises.Femi.ComputerAssistantInstruction.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//class ComputerAssistantInstructionTest {
//
//
//    @Test
//    public void testGenerateRandomNumber(){
//        int number = generateRandomNumber();
//
//        boolean isNumberBetweenOneAndNine = number > 0 && number <= 9;
//        assertTrue(isNumberBetweenOneAndNine);
//    }
//    @Test
//    public  void testGenerateQuestion(){
//        String question = generateQuestion();
//        assertNotNull(question);
//        boolean isBlankQuestion = question.isBlank();
//        assertFalse(isBlankQuestion);
//    }
//
//    @Test
//    public  void testISCorrectAnswer(){
//        generateQuestion();
//        boolean isAnswerCorrect = isAnswerCorrect(7);
//        assertTrue(isAnswerCorrect);
//    }
//
//    @Test
//    public void testDisplayMessage(){
//        String message = "Very good";
//        String display = createDisplay(message);
//        assertNotNull(display);
//    }
//
//}