package Dietelchapter3;

public class DisplayTime {
    public static void main(String[] args) {

        Clock thisClock = new Clock();
        thisClock.setHour(15);
        thisClock.setMinute(20);
        thisClock.setSecond(40);
        System.out.println("The time is: " + thisClock.displayTime());
    }

}
