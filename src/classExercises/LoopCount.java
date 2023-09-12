package classExercises;

import java.util.Scanner;

public class LoopCount{
    public static void main(String[] args) {
        System.out.println("Enter your choice of language :");
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Press
                1-> English
                2-> Yoruba
                3-> Pidgin
                4-> igbo
                """);
        int number = input.nextInt();
        switch (number){
            case 2:
                System.out.println("Yoruba");
                System.out.println("Se yoruba egbe ni e fe so ? 1 fun beeni,2 fun beeko");
                int speakEgba;
                speakEgba = input.nextInt();
                switch (speakEgba){
                    case 1:
                        System.out.println("Yoruba egba ni e fe so!");
                        break;
                    case 2:
                        System.out.println("Yoruba egba ko le fe so!");
                        break;
                }
                break;
            case 1:
                System.out.println("English");
                System.out.println("What's your level of English ? Press 1 Excellent. Press 2 for average");
                int speakEnglish = input.nextInt();
                switch (speakEnglish){
                    case 1:
                        System.out.println("You have chosen to speak excellent English");
                        break;
                    case 2:
                        System.out.println("You have chosen to speak average English");
                }
                break;
            case 3:
                System.out.println("pidgin");
                System.out.println("You wan speak pidgin ? Yes or No ?");
                int speakWafi;
                speakWafi = input.nextInt();
                switch (speakWafi){
                    case 1:
                        System.out.println("Let's go! Pidgin mode on");
                        break;
                    case 2:
                        System.out.println("Pidgin mode off ");
                        break;
                }
                break;
            case 4:
                System.out.println("igbo");
                System.out.println("core igbo or average igbo ? For average igbo press 1,for core igbo press 2");
                int igbo;
                int speakIgbo = input.nextInt();
                switch (speakIgbo){
                    case 1:
                        System.out.println("Average igbo it is!");
                        break;
                    case 2:
                        System.out.println("igbo kwennu,core igbo it is!");
                        break;
                }




        }
    }

}