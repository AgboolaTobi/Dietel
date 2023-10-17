package mrChibuzo;

import java.util.Scanner;

public class Personality{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] answers = new String[20];
        int answerA = 0;
        int answerB = 0;
        String [] extrovertQuestion = {"Expend energy, enjoy group ", "more outgoing, think out loud"};
        String [] introvertQuestion = {"Conserve energy and for one ", "more reserved, think to your self"};
        System.out.printf("A. %s\t\tB. %s", extrovertQuestion[0], introvertQuestion[0]);
        String answer = input.next().toUpperCase();
        while (!answer.equals("A") && !answer.equals("B")){
            System.out.printf("A. %s\t\tB. %s", extrovertQuestion[0], introvertQuestion[0]);
            answer = input.next().toUpperCase();
        }
        if (answer.equals("A")){
            answers[0] = "A." + extrovertQuestion[0];
            answerA++;
        }else {
            answers[0] = answer + introvertQuestion[0];
            answerB++;
        }
        System.out.println();
        System.out.printf("A. %s\t\tB. %s", extrovertQuestion[1], introvertQuestion[1]);
        answer = input.next().toUpperCase();
        if (answer.equals("A")){
            answers[1] = answer + extrovertQuestion[1];
            answerA++;
        }else {
            answers[1] = answer + introvertQuestion[1];
            answerB++;
        }
        System.out.println(answers[0]);
        System.out.println(answers[1]);
        System.out.println("Number of A picked is " + answerA);
        System.out.println("Number of B picked is " + answerB);



    }
}