package PersonalAssessments;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    public void createTimeTest(){
        Time time = new Time(1,0,0);
        assertEquals(1,time.getHour());
        assertEquals(0,time.getMinutes());
        assertEquals(0,time.getSecond());
    }
    @Test
    public void createTimeWithInvalidHourTest(){
        assertThrows(Exception.class,()->new Time(25,67,0));
    }
    @Test
    public void createTimeWithInvalidMinutesTest(){
        assertThrows(Exception.class,()->new Time(2,67,0));
    }
    @Test
    public void createTimeWithInvalidSecondTest(){
        assertThrows(Exception.class,()->new Time(2,40,90));
    }

    public static void main(String... args) {
        Time time = new Time(0,0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = 0;

        try {hour = scanner.nextInt();
            time = new Time(hour,32,23);
            System.out.println("Hour is " + time.getHour());
        }
//        catch (InputMismatchException tobi){
//            System.out.println("Have some sense na !");
//            main();
//        }
        catch (Exception tobi){
            System.out.println("Have some sense na !");
            main();
        }
//        this will catch all types of exception

//        catch (IllegalArgumentException ex){
//            System.out.println("Oga get sense");
//            main();
//        }

    }


}