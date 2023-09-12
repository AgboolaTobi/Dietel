package Assignment1;

import java.util.Scanner;

public class Nokia3310 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mainMethod();
    }
        public static  void mainMethod() {
            System.out.println("""
                    ================
                    1-> PhoneBook
                     2. Message
                     3. Chat
                      4. Call register
                      5. Tones
                      6. Settings
                      7. Call divert
                      8. Games
                      9. Calculator
                      10. Reminders
                     11. Clock
                     12. Profiles
                     13. SIM Services            
                    """);
            System.out.println("Enter your option chosen: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> phonebook();
                case 2 -> message();
            }
        }

    private static void message() {

    }

    public static void phonebook(){
        System.out.println("""
                ================
                 1. Search
                2. Service Nos.
                3.Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                """);
        System.out.println("Enter your response: ");
        int response = scanner.nextInt();
        switch(response){
            case 1:
                System.out.println("Search");
                System.out.println("Press 1 to phoneBook");
                int phonebook = scanner.nextInt();
                System.out.println("Press 2 to mainMenu");
                int main = scanner.nextInt();
                if (phonebook == 1){
                    phonebook();
                } else System.out.println("Press 1 to phonebook ode ");
                if (main == 2){
                    mainMethod();
                }else System.out.println("Press 2 to mainMenu ode ");

                }

        }
    }

