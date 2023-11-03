package mrChibuzo.Nokia3310;
import java.util.Scanner;

public class NewNokiaTest {
        public static void phoneBook() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                press
                1. Search
                2. ServiceNos
                3. AddName
                4. Erase
                5. Edit
                6. Assign Tone
                7. Send b'Card
                8. Options
                9. Speed
                10. Voice Tags
                11.Main Menu
                """);
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Search");
                    break;

                case 2:
                    System.out.println("Service numbers");
                    break;

                case 3:
                    System.out.println("Add name");
                    break;

                case 4:
                    System.out.println("Erase");
                    break;

                case 5:
                    System.out.println("Edit");
                    break;

                case 6:
                    System.out.println("Assign Tone");
                    break;

                case 7:
                    System.out.println("Send b' card");
                    break;

                case 8:
                    System.out.println("""
                        Press
                        1. Type Of View
                        2. Memory Status
                        3. Go Back
                        4.Main Menu
                        """);
                    int options = scanner.nextInt();
                    switch (options) {
                        case 1:
                            System.out.println("type Of view on mode");
                            break;
                        case 2:
                            System.out.println("memory status on mode");
                            break;

                        case 3:
                            phoneBook();

                        case 4:
                            NewNokia.mainMenu();

                    }
                case 9:
                    System.out.println("Speed dial");
                    break;

                case 10:
                    System.out.println("voice tags");
                    break;

                case 11:
                    NewNokia.mainMenu();
            }

        }

        public static void message() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                == MESSAGES ==
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                11. Main Menu
                """);
            int message = scanner.nextInt();
            switch (message) {
                case 1:
                    System.out.println("Write message");
                    break;

                case 2:
                    System.out.println("Inbox");
                    break;

                case 3:
                    System.out.println("OutBox");
                    break;

                case 4:
                    System.out.println("Picture Messages");
                    break;

                case 5:
                    System.out.println("Templates");
                    break;

                case 6:
                    System.out.println("Smiley");
                    break;

                case 7:
                    System.out.println("""
                        Message setting
                        1->Set
                        2->Common
                        3->Go back
                        4->main menu""");
                    int setting = scanner.nextInt();

                    switch (setting) {
                        case 1:
                            System.out.println("""
                                1. Message center Number
                                2. Message sent as
                                3. Message validity
                                4. Go back
                                5. main menu""");
                            int settings = scanner.nextInt();
                            switch (settings) {
                                case 1:
                                    System.out.println("Message Center Number");
                                    break;

                                case 2:
                                    System.out.println("Message Sent as");
                                    break;

                                case 3:
                                    System.out.println("Message Validity");
                                    break;

                                case 4:
                                    message();

                                case 5:
                                    NewNokia.mainMenu();

                            }

                        case 2:
                            System.out.println("""
                                1.Delivery Report
                                2.Reply Via Same Center
                                3.Character support
                                4.go back
                                5.main menu""");
                            int common = scanner.nextInt();
                            switch (common) {
                                case 1:
                                    System.out.println("Delivery Report");
                                    break;

                                case 2:
                                    System.out.println("Reply Via Same Center");
                                    break;

                                case 3:
                                    System.out.println("Character support");
                                    break;

                                case 4:
                                    message();

                                case 5:
                                    NewNokia.mainMenu();
                                    break;
                            }

                        case 3:
                            message();

                        case 4:
                            NewNokia.mainMenu();

                    }

                case 8:
                    System.out.println("Info Services");
                    break;

                case 9:
                    System.out.println("Voice MailBox Number");
                    break;

                case 10:
                    System.out.println("Service Command Editor");
                    break;

                case 11:
                    NewNokia.mainMenu();

            }


        }

        public static void chat() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Chat
                2. Main Menu""");
            int chats = scanner.nextInt();
            switch (chats) {
                case 1 -> System.out.println("Chat");
                case 2 -> NewNokia.mainMenu();
            }


        }

        public static void callRegister() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                press
                1. Missed call
                2. Received call
                3. Dialled Numbers
                4. Erase recent call list
                5. Show Call Duration
                6. Show call Costs
                7. Call Cost Setting
                8. Prepaid Credit
                9.Main Menu
                """);
            int callRegister = scanner.nextInt();
            switch (callRegister) {
                case 1:
                    System.out.println("Missed Call");
                    break;

                case 2:
                    System.out.println("Received Call");
                    break;

                case 3:
                    System.out.println("Dialled Numbers");
                    break;

                case 4:
                    System.out.println("Erase Recent Call List");
                    break;

                case 5:
                    System.out.println("""
                        1. Last Call Duration
                        2. All Call's Duration
                        3. Receive Call's Duration
                        4. Dialled Call Duration
                        5. Clear Timers
                        6. Go Back
                        7. Main Menu""");
                    int duration = scanner.nextInt();
                    switch (duration) {
                        case 1:
                            System.out.println("Last Call Duration");
                            break;

                        case 2:
                            System.out.println("All Call's Duration");
                            break;

                        case 3:
                            System.out.println("Receive Call Duration");
                            break;

                        case 4:
                            System.out.println("Dialled Call Duration");
                            break;
                        case 5:
                            System.out.println("Clear Timers");
                            break;

                        case 6:
                            callRegister();

                        case 7:
                            NewNokia.mainMenu();
                    }
                case 6:
                    System.out.println("""
                        1. Last Call Cost
                        2.All Call Cost
                        3.Clear Counters
                        4.Go Back
                        5. MAin Menu""");
                    int callCost = scanner.nextInt();
                    switch (callCost) {
                        case 1:
                            System.out.println("Last Call Cost");
                            break;

                        case 2:
                            System.out.println("All Call Cost");
                            break;

                        case 3:
                            System.out.println("Clear Counters");
                            break;

                        case 4:
                            callRegister();

                        case 5:
                            NewNokia.mainMenu();


                    }

                case 7:
                    System.out.println("""
                        1. Call Cost Limit
                        2. Show Cost In
                        3. Go Back
                        4. Main Menu""");
                    int showCall = scanner.nextInt();
                    switch (showCall) {
                        case 1:
                            System.out.println("Call Cost Limit");
                            break;

                        case 2:
                            System.out.println("Show Cost In");
                            break;

                        case 3:
                            callRegister();

                        case 4:
                            NewNokia.mainMenu();

                    }
                case 8:
                    System.out.println("Prepaid Credit");
                    break;

                case 9:
                    NewNokia.mainMenu();


            }
        }

        public static void tones() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                 ==TONES==
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning tones
                8. Vibrating alert
                9. Screen saver
                10. Main Menu
                """);
            int tone = scanner.nextInt();
            switch (tone) {
                case 1 -> System.out.println("Ringing tones");
                case 2 -> System.out.println("Ringing volume");
                case 3 -> System.out.println("Incoming call alert");
                case 4 -> System.out.println("Composer...");
                case 5 -> System.out.println("Message alert tone");
                case 6 -> System.out.println("Keypad tones");
                case 7 -> System.out.println(" Warning and Game Tones");
                case 8 -> System.out.println("Vibrating alert");
                case 9 -> System.out.println("Screen saver");
                case 10 -> NewNokia.mainMenu();
            }
        }

        public static void settings() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                ==== Setting ====
                1-> Call settings
                2-> Phone settings
                3-> Security settings
                4-> Restore factory setting
                5. Main Menu
                """);
            int setting = scanner.nextInt();
            switch (setting) {
                case 1:
                    System.out.println("""
                          Call setting
                        1. Automatic Redial
                        2. Speed Dialing
                        3. Call Waiting Option
                        4. Own Number Sending
                        5. Phone line in use
                        6. Automatic Answer
                        7. Go Back
                        8. Main Menu""");
                    int user = scanner.nextInt();
                    switch (user) {
                        case 1: {
                            System.out.println("Automatic redial");
                            break;
                        }

                        case 2: {
                            System.out.println("Speed dialing");
                            break;
                        }

                        case 3: {
                            System.out.println("Call waiting option");
                            break;
                        }

                        case 4: {
                            System.out.println("Own number sending");
                            break;
                        }

                        case 5: {
                            System.out.println("Phone line in use");
                            break;
                        }

                        case 6: {
                            System.out.println("Automatic answer");
                            break;
                        }

                        case 7: {
                            settings();
                        }

                        case 8: {
                            NewNokia.mainMenu();
                        }

                    }
                    break;
                case 2:{
                    System.out.println("""
                        Phone settings
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm sim service action
                        7. Go Back
                        8. Main Menu""");
                    int phoneSettings = scanner.nextInt();
                    switch (phoneSettings) {
                        case 1:
                            System.out.println("Language");
                            break;

                        case 2:
                            System.out.println(" Cell info display");
                            break;

                        case 3:
                            System.out.println(" Welcome note");
                            break;

                        case 4:
                            System.out.println("Network selection");
                            break;

                        case 5:
                            System.out.println("Lights");
                            break;

                        case 6:
                            System.out.println("Confirm sim service action");
                            break;

                        case 7:
                            settings();

                        case 8:
                            NewNokia.mainMenu();
                    }
                }

                case 3:
                    System.out.println("""
                        Security settings
                        1. Pin code request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change access code
                        7. Go back
                        8. Main Menu""");
                    int securitySetting = scanner.nextInt();
                    switch (securitySetting) {
                        case 1:
                            System.out.println("Pin Code Request");
                            break;

                        case 2:
                            System.out.println("Call Barring Service");
                            break;

                        case 3:
                            System.out.println("Fixed Dialling");
                            break;

                        case 4:
                            System.out.println("Closed User Group");
                            break;

                        case 5:
                            System.out.println(" Phone Security");
                            break;

                        case 6:
                            System.out.println("Change Access Code");
                            break;

                        case 7:
                            settings();

                        case 8:
                            NewNokia.mainMenu();
                    }
                case 4:
                    System.out.println("Restore Factory");
                    break;

                case 5:
                    NewNokia.mainMenu();


            }
        }

        public static void callDivert() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Call Divert
                2. Main Menu""");
            int divert = scanner.nextInt();
            switch (divert) {
                case 1 -> System.out.println("Call Divert");
                case 2 -> NewNokia.mainMenu();
            }


        }

        public static void games() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Games
                2. Main Menu""");
            int game = scanner.nextInt();
            switch (game) {
                case 1 -> System.out.println("""
                        1.games
                        2.go back""");
                case 2 -> NewNokia.mainMenu();
            }
        }

        public static void calculator() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Calculator
                2. Main Menu""");
            int calculator = scanner.nextInt();
            switch (calculator) {
                case 1 -> System.out.println("Calculator");
                case 2 -> NewNokia.mainMenu();
            }

        }

        public static void reminders() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Reminders
                2. Main Menu""");
            int reminder = scanner.nextInt();
            switch (reminder) {
                case 1 -> System.out.println("Reminders");
                case 2 -> NewNokia.mainMenu();
            }

        }

        public static void clock() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Alarm Clock
                2. Clock Settings
                3. Date Setting
                4. Stop Watch
                5. CountDown timer
                6. Auto Update Of Date And Time
                7. Main Menu""");
            int clockSetting = scanner.nextInt();
            switch (clockSetting) {
                case 1 -> System.out.println("Alarm clock");
                case 2 -> System.out.println("Clock setting");
                case 3 -> System.out.println("Date setting");
                case 4 -> System.out.println("Stopwatch");
                case 5 -> System.out.println("CountDown timer");
                case 6 -> System.out.println("Auto update of date and time");
                case 7 -> NewNokia.mainMenu();
            }
        }

        public static void profiles() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Profiles
                2. Main Menu""");
            int profiles = scanner.nextInt();
            switch (profiles) {
                case 1 -> System.out.println("Profiles");
                case 2 -> NewNokia.mainMenu();
            }
        }
        public static void simServices() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1. Sim services
                2. Main Menu""");
            int service = scanner.nextInt();
            switch (service) {
                case 1 -> System.out.println("SIM service");
                case 2 -> NewNokia.mainMenu();
            }
        }
}