package mrChibuzo;

import java.util.Scanner;

public class PersonalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        String[] questionEI = {"expend energy,enjoy groups", "conserve energy, enjoy one-on-one",
                "more outgoing, think out loud", "more reserved, think to yourself",
                "seeks many tasks, public activities, interaction with others", "seek private, solidarity activities with quiet to concentrate",
                "external, communicative, express yourself", "internal, reticent, keep to yourself",
                "active, initiate", "reflective, deliberate"};

        String[] resultEI = new String[questionEI.length / 2];
        StringBuilder storeEI = new StringBuilder();
        for (int loopEI = 0; loopEI < questionEI.length; loopEI++) {
            System.out.println("A. " + questionEI[loopEI] + "           B. " + questionEI[loopEI +1]);
            String answer = scanner.nextLine().toUpperCase();
            while (!(answer.equals("A") || answer.equals("B"))){
                System.out.println("Expects A or B as response \n Please try again");
                System.out.println("A. " + questionEI[loopEI] + "           B. " + questionEI[loopEI +1]);
                answer = scanner.nextLine().toUpperCase();
            }
            resultEI[loopEI / 2] = answer;
            if (answer.equals("A")){storeEI.append("A. ").append(questionEI[loopEI]).append("\n");}
            if (answer.equals("B")){storeEI.append("B. ").append(questionEI[loopEI + 1]).append("\n");}
        }
        int first = 0;
        int second = 0;
        for (String string : resultEI){
            if (string.equals("A")){
                first += 1;
            }
            else if (string.equals("B")){
                second += 1;
            }
        }

        String changeEI = storeEI.toString();
        String[] changeEI2 = changeEI.split("\n");
        String result1 =" ";
        if (first > second){result1 = "E";}
        else if (second > first){result1 = "I";}
        System.out.println(first);

        String[] questionSN = {"Interpret literally", "look for meaning and possibilities",
        "practical, realistic, experimental", "imaginative, innovative , theoretical",
        "standard, usual, conventional", "different, novel, unique",
        "focus on here-and-now", "look to the future, global perspective, big picture",
        "facts, things, what is, philosophical", "ideas, dreams, what could be"};

        String[] resultSN = new String[questionSN.length / 2];
        StringBuilder storeSN = new StringBuilder();

        for (int loopSN = 0; loopSN < questionSN.length ; loopSN++){
            System.out.println("A. " + questionSN[loopSN] + "           B. " + questionSN[loopSN +1]);
            String answerSN = scanner.nextLine().toUpperCase();
            while (!(answerSN.equals("A") || answerSN.equals("B"))){
                System.out.println("Expects A or B as response \n Please try again");
                System.out.println("A. " + questionSN[loopSN] + "           B. " + questionSN[loopSN+1]);
                answerSN = scanner.nextLine().toUpperCase();
            }
            resultSN[loopSN / 2] = answerSN;
            if (answerSN.equals("A")){storeSN.append("A. ").append(questionSN[loopSN]).append("\n");}
            if (answerSN.equals("A")){storeSN.append("A. ").append(questionSN[loopSN]).append("\n");}
        }
        int third = 0;
        int fourth = 0;
        for (String count : resultSN){
            if (count.equals("A")){
                third += 1;
            }
        }
        String changeSN = storeSN.toString();
        String[] changeSN2 = changeSN.split("\n");
        String result2=" ";
        if (third > fourth){result2 = "S";}
        else if (fourth > third){result2 = "N";}
        System.out.println(third);

        String[] questionTF = {"logical, thinking, questioning", "empathetic, feeling, accommodating",
        "candid, straight forward, frank", "tactful, kind, encouraging",
        "firm, tend to criticize, hold the line", " gentle, tend to appreciate, conciliate",
        "tough-minded, just", "tender-hearted, merciful",
        "matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"};

        String[] resultTF = new String[questionTF.length / 2];
        StringBuilder storeTF = new StringBuilder();
        for (int loopTF = 0; loopTF < questionTF.length; loopTF++) {
            System.out.println("A. " + questionTF[loopTF] + "           B. " + questionTF[loopTF +1]);
            String answer = scanner.nextLine().toUpperCase();
            while (!(answer.equals("A") || answer.equals("B"))){
                System.out.println("Expects A or B as response \n Please try again");
                System.out.println("A. " + questionTF[loopTF] + "           B. " + questionEI[loopTF +1]);
                answer = scanner.nextLine().toUpperCase();
            }
            resultEI[loopTF / 2] = answer;
            if (answer.equals("A")){storeEI.append("A. ").append(questionTF[loopTF]).append("\n");}
            if (answer.equals("B")){storeEI.append("B. ").append(questionTF[loopTF + 1]).append("\n");}
        }
        int fifth = 0;
        int sixth = 0;
        for (String string : resultTF){
            if (string.equals("A")){
                first += 1;
            }
            else if (string.equals("B")){
                second += 1;
            }
        }

        String changeTF = storeTF.toString();
        String[] changeTF2 = changeTF.split("\n");
        String result3 =" ";
        if (fifth > sixth){result3 = "T";}
        else if (sixth > fifth){result3 = "F";}
        System.out.println(fifth
        );

        String[] questionJP = {"organized, orderly", "flexible, adaptable",
        "plan, schedule", "unplanned, spontaneous",
        "regulated, structured", "easy-going", "live and let live",
        "preparation, plan ahead", "go with the flow, adapt as you go",
        "control, govern", "latitude, freedom"};

        String[] resultJP = new String[questionJP.length / 2];
        StringBuilder storeJP = new StringBuilder();
        for (int loopJP = 0; loopJP < questionTF.length; loopJP++) {
            System.out.println("A. " + questionTF[loopJP] + "           B. " + questionTF[loopJP +1]);
            String answer = scanner.nextLine().toUpperCase();
            while (!(answer.equals("A") || answer.equals("B"))){
                System.out.println("Expects A or B as response \n Please try again");
                System.out.println("A. " + questionJP[loopJP] + "           B. " + questionJP[loopJP +1]);
                answer = scanner.nextLine().toUpperCase();
            }
            resultJP[loopJP / 2] = answer;
            if (answer.equals("A")){storeJP.append("A. ").append(questionJP[loopJP]).append("\n");}
            if (answer.equals("B")){storeJP.append("B. ").append(questionTF[loopJP + 1]).append("\n");}
        }
        int seventh = 0;
        int eighth = 0;
        for (String string : resultJP){
            if (string.equals("A")){
                seventh += 1;
            }
            else if (string.equals("B")){
                eighth += 1;
            }
        }

        String changeJP = storeJP.toString();
        String[] changeJP2 = changeJP.split("\n");
        String result4 =" ";
        if (seventh > eighth){result4 = "J";}
        else if (eighth > seventh){result4 = "P";}

        System.out.printf("Hello %s You selected %n", name);
        for (int count = 0; count < resultEI.length; count++){
            System.out.println(changeEI2[count]);}
        System.out.println("The number of A selected: " + first + "\n" + "The number of B selected: " + second + "\n");

        for (int count = 0; count < resultSN.length; count++){
            System.out.println(changeSN2[count]);}
            System.out.println("The number of A selected: " + third + "\n" + "The number of B selected: " + fourth + "\n");

        for (int count = 0; count < resultTF.length; count++){
            System.out.println(changeTF2[count]);}
        System.out.println("The number of A selected: " + fifth + "\n" + "The number of B selected: " + sixth + "\n");

        for (int count = 0; count < resultJP.length; count++){
            System.out.println(changeJP2[count]);}
        System.out.println("The number of A selected: " + seventh + "\n" + "The number of B selected: " + eighth + "\n");

        switch (result1 + result2 + result3 + result4){
            case "INTJ" -> System.out.println("""
                    
                    """);
        }
    }
}
