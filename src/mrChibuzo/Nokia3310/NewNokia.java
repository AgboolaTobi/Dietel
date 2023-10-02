package mrChibuzo.Nokia3310;
import java.util.Scanner;
public class NewNokia {
        public static void main(String[] args) {
            mainMenu();

        }
        public static void mainMenu(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                  ===List of Menu Functions===
                1. Phone book
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
                14. exit
                
                """);
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("PhoneBook");
                    NewNokiaTest.phoneBook();
                }
                case 2 -> {
                    System.out.println("Message");
                    NewNokiaTest.message();
                }
                case 3 -> {
                    System.out.println("Chat");
                    NewNokiaTest.chat();
                }
                case 4 -> {
                    System.out.println("Call Register");
                    NewNokiaTest.callRegister();
                }
                case 5 -> {
                    System.out.println("Tones");
                    NewNokiaTest.tones();
                }
                case 6 -> {
                    System.out.println("Setting");
                    NewNokiaTest.settings();
                }
                case 7 -> {
                    System.out.println("Call Divert");
                    NewNokiaTest.callDivert();
                }
                case 8 -> {
                    System.out.println("Games");
                    NewNokiaTest.games();
                }
                case 9 -> {
                    System.out.println("Calculator");
                    NewNokiaTest.calculator();
                }
                case 10 -> {
                    System.out.println("Reminders");
                    NewNokiaTest.reminders();
                }
                case 11 -> {
                    System.out.println("Clock");
                    NewNokiaTest.clock();
                }
                case 12 -> {
                    System.out.println("Profiles");
                    NewNokiaTest.profiles();
                }
                case 13 -> {
                    System.out.println("SIM Services");
                    NewNokiaTest.simServices();
                }
                default -> {
                }
            }
        }
}
