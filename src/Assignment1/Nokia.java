package Assignment1;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                """);
        int input = scan.nextInt();
        switch (input) {
            case 1:
                System.out.println("""
                        ===PHONEBOOK===
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
                int phonebook = scan.nextInt();
                switch (phonebook) {
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
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("""
                                Options
                                1-> Type of view
                                2-> Memory status
                                """);
                        int options = scan.nextInt();
                        switch (options) {
                            case 1 -> {
                                System.out.println("Type of view");
                                break;
                            }
                            case 2 -> {
                                System.out.println("Memory status: 234Mb");
                                break;
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Voice mailbox number- 130");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;

                }
                break;
            case 2:
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
                        """);
                int message = scan.nextInt();
                switch (message) {
                    case 1:
                        System.out.println("Dear Customer,your subscription...");
                        break;
                    case 2:
                        System.out.println("Your inbox is empty");
                        break;
                    case 3:
                        System.out.println("No sent messages");
                        break;
                    case 4:
                        System.out.println("No picture messages available");
                        break;
                    case 5:
                        System.out.println("Templates ");
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("""
                                Message setting
                                1->Set
                                2->Common
                                """);
                        int messageSetting = scan.nextInt();
                        switch (messageSetting) {
                            case 1:
                                System.out.println("""
                                        Set
                                        1-> Message centre number
                                        2. Message sent as
                                        3. Message validity
                                        """);
                                int set = scan.nextInt();
                                switch (set) {
                                    case 1 -> System.out.println("");
                                    case 2 -> System.out.println("Agboola Tobi Samuel");
                                    case 3 -> System.out.println("15days");
                                }
                                break;
                            case 2:
                                int common = scan.nextInt();
                                switch (common) {
                                    case 1 -> System.out.println("Delivery report");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support : Agboola Tobi");
                                }
                        }
                        break;
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number is 113");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                }
                break;
            case 3:
                System.out.println("Chat");
                break;

            case 4:
                System.out.println("""
                        == Call register==
                        1->Missed calls
                        2->Received calls
                        3->Dialled numbers
                        4->Erase recent call lists
                        5->Show call duration
                        6->Show call costs
                        7->Call cost settings
                        8->Prepaid credit
                        """);
                int callRegister = scan.nextInt();
                switch (callRegister) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled number");
                        break;
                    case 4:
                        System.out.println("Erase recent call list");
                        break;
                    case 5:
                        System.out.println("""
                                Show call duration
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """);
                        int callDuration = scan.nextInt();
                        switch (callDuration) {
                            case 1 -> System.out.println("Last call duration:2mins 45secs");
                            case 2 -> System.out.println("All call duration:45hrs 53mins 31secs");
                            case 3 -> System.out.println("Received calls' duration:21hrs 50mins 01secs");
                            case 4 -> System.out.println("Dailed calls' duration:24hrs 03mins 30secs");
                            case 5 -> System.out.println("Clear counters...Press back");
                        }
                        break;
                    case 6:
                        System.out.println("""
                                Show call costs
                                1-> Last call cost
                                2-> All calls' cost
                                3-> Clear counters
                                """);
                        int callCost = scan.nextInt();
                        switch (callCost) {
                            case 1 -> System.out.println("Last call cost: N12.65");
                            case 2 -> System.out.println("All calls' cost:N9600.52");
                            case 3 -> System.out.println("Clear counters: Option is unavailable" +
                                    "press back");
                        }
                        break;
                    case 7:
                        System.out.println("""
                                Call cost setting
                                1->Call cost limit
                                2. Show costs in
                                """);
                        int callCostSetting = scan.nextInt();
                        switch (callCostSetting) {
                            case 1 -> System.out.println("Call cost limit:5mins");
                            case 2 -> System.out.println("Show cost cost in:Naira");
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit:N0.00");
                        break;
                }
                break;

            case 5:
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
                        """);
                int tones = scan.nextInt();
                switch (tones) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert Honk honk");
                    case 4 -> System.out.println("Composer...");
                    case 5 -> System.out.println("Message alert tone birds");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning tones Christmas");
                    case 8 -> System.out.println("Vibrating alert OOO...");
                    case 9 -> System.out.println("Screen saver Picture IMAGE002");
                }
                break;

            case 6:
                System.out.println("""
                        ==== Setting ====
                        1-> Call settings
                        2-> Phone settings
                        3-> Security settings
                        4-> Restore factory setting
                        """);
                int setting = scan.nextInt();
                switch (setting){
                    case 1:
                        System.out.println("""
                                Call setting
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """);
                        int callSetting = scan.nextInt();
                        switch (callSetting){
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialling");
                                break;
                            case 3:
                                System.out.println("Call waiting options");
                                break;
                            case 4:
                                System.out.println("Own number sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("""
                                Phone settings
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                """);
                        int phoneSetting = scan.nextInt();
                        switch (phoneSetting){
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                    System.out.println("Cell info display");
                                    break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println("Network selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("""
                                Security settings
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """);
                        int securitySetting = scan.nextInt();
                        switch (securitySetting){
                            case 1:
                                System.out.println("PIN code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println("Fixed dialing");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access codes");
                                break;
                        }
                        break;

                }
                break;
            case 7:
                System.out.println("""
                         Call divert
                        1-> Divert all voice calls without ringing
                        2-> Divert when busy
                        3-> Divert if not answered
                        4-> Divert when phone off or no coverage
                        5-> Divert when off, no answer, or no coverage
                        6->Cancel all diverts
                        """);
                int callDivert =scan.nextInt();
                switch (callDivert){
                    case 1:
                        System.out.println("Divert all voice calls without ringing");
                        break;
                    case 2:
                        System.out.println("Divert when busy");
                        break;
                    case 3:
                        System.out.println("Divert if not answered");
                        break;
                    case 4:
                        System.out.println("Divert when phone off or no coverage");
                        break;
                    case 5:
                        System.out.println("Divert when off, no answer, or no coverage");
                        break;
                    case 6:
                        System.out.println("Cancel all diverts");
                        break;

                }
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println(".Reminders");
                break;
            case 11:
                System.out.println("""
                        Clock
                        1->Alarm clock
                        2->Clock settings
                        3->Date setting
                        4->Stopwatch
                        5->Countdown timer
                        6->Auto update of date and time
                        """);
                int clock = scan.nextInt();
                switch (clock){
                    case 1:
                        System.out.println(" Alarm clock");
                        break;
                    case 2:
                        System.out.println(" Clock settings");
                        break;
                    case 3:
                        System.out.println(" Date setting");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Auto update of date and time");
                        break;
                }
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;

        }
    }

}
