package Assignment1;

import java.util.Scanner;

public class Nokia {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
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
                        System.out.println("""
                                Service numbers
                                1. 181
                                2. 180
                                3. 131
                                """);
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
                        System.out.println("Options");
                        int options = scan.nextInt();
                        switch (options) {
                            case 1:
                                System.out.println("Type of view: Elongated");
                                break;
                            case 2:
                                System.out.println("Memory status: 234Mb");
                                break;
                        }
                    case 9:
                        System.out.println("Voice mailbox number- 130");
                        break;
                    case 10:
                        System.out.println("""
                                Service command editor
                                Unavailable
                                """);
                        break;
                }
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
                        System.out.println("""
                                MTN
                                Dear Customer,your subscription...
                                """);
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
                        System.out.println("""
                                1. I'm busy now,call later..
                                2. Can't pict now. Let's talk later
                                3. Send a message instead
                                4. Currently in church,call in 30 minutes
                                """);
                        int templates = scan.nextInt();
                        switch (templates) {
                            case 1:
                                System.out.println("I'm busy now,call later...");
                                break;
                            case 2:
                                System.out.println("Can't pict now. Let's talk later");
                                break;
                            case 3:
                                System.out.println("Send a message instead");
                                break;
                            case 4:
                                System.out.println("Currently in church,call in 30 minutes");
                                break;
                        }
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
                                    case 1:
                                        System.out.println("234573856272");
                                        break;
                                    case 2:
                                        System.out.println("Agboola Tobi Samuel");
                                        break;
                                    case 3:
                                        System.out.println("15days");
                                        break;
                                }
                            case 2:
                                int common = scan.nextInt();
                                switch (common) {
                                    case 1:
                                        System.out.println("""
                                                Delivery reports
                                                1. Message delivered
                                                2. Message not sent
                                                3. Message declined
                                                4. Message delivered
                                                """);
                                        break;
                                    case 2:
                                        System.out.println("""
                                                Reply via same centre(+234689529540978)
                                                """);
                                        break;
                                    case 3:
                                        System.out.println("Character support : Agboola Tobi");
                                }
                        }
                    case 8:
                        System.out.println("""
                                Info service
                                181
                                180
                                """);
                        break;
                    case 9:
                        System.out.println("Voice mailbox number is 113");
                        break;
                    case 10:
                        System.out.println("Service command editor" +
                                "100");
                        break;
                }
            case 3:
                System.out.println("""
                        Chat
                        Compose your message...
                        """);
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
                        System.out.println("08068952954");
                        System.out.println("08129335643");
                        System.out.println("07054291950");
                        break;
                    case 2:
                        System.out.println("08154564163" + "n\08134067074");
                        break;
                    case 3:
                        System.out.println("Dialled number" + " n\08068429373");
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
                            case 1:
                                System.out.println("Last call duration:2mins 45secs");
                                break;
                            case 2:
                                System.out.println("All call duration:45hrs 53mins 31secs");
                                break;
                            case 3:
                                System.out.println("Received calls' duration:21hrs 50mins 01secs");
                                break;
                            case 4:
                                System.out.println("Dailed calls' duration:24hrs 03mins 30secs");
                                break;
                            case 5:
                                System.out.println("Clear counters...Press back");
                                break;
                        }
                    case 6:
                        System.out.println("""
                                Show call costs
                                1-> Last call cost
                                2-> All calls' cost
                                3-> Clear counters
                                """);

                        int callCost = scan.nextInt();
                        switch (callCost) {
                            case 1:
                                System.out.println("Last call cost: N12.65");
                                break;
                            case 2:
                                System.out.println("All calls' cost:N9600.52");
                                break;
                            case 3:
                                System.out.println("Clear counters: Option is unavailable" +
                                        "press back");
                                break;
                        }
                    case 7:
                        System.out.println("""
                                Call cost setting
                                1->Call cost limit
                                2. Show costs in
                                """);
                        int callCostSetting = scan.nextInt();
                        switch (callCostSetting) {
                            case 1:
                                System.out.println("Call cost limit:5mins");
                                break;
                            case 2:
                                System.out.println("Show cost cost in:Naira");
                                break;
                        }
                    case 8:
                        System.out.println("Prepaid credit:N0.00");
                        break;
                }

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
                    case 1:
                        System.out.println("""
                                Ringing tone
                                1. Christmas
                                2. Birds
                                3. Honk honk
                                4. Lets dance
                                """);
                        break;
                    case 2:
                        System.out.println("""
                                Ringing volume
                                OOOOO....
                                """);
                        break;
                    case 3:
                        System.out.println("""
                                Incoming call alert
                                Honk honk
                                """);
                        break;
                    case 4:
                        System.out.println("Composer...");
                        break;
                    case 5:
                        System.out.println("""
                                Message alert tone
                                birds
                                """);
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("""
                                Warning tones
                                Christmas
                                """);
                        break;
                    case 8:
                        System.out.println("Vibrating alert OOO...");
                        break;
                    case 9:
                        System.out.println("""
                                Screen saver Picture
                                IMAGE002
                                """);
                        break;
                }
        }

    }

}
