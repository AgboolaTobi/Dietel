package PersonalAssessments;

public class Time {
    private int hour;
    private int minutes;
    private int second;

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public Time (int hour, int minutes, int second){
       validate(hour,minutes,second);
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }
    public void validate(int hour,int minutes,int second){
        validateHour(hour);
//        NOTE: You should not call methods in a constructor,rather call functions
        validateMinutes(minutes);
        validateSecond(second);
    }
    private static void validateSecond(int second){
        boolean secondIsInvalid = second > 59 || second < 0;
        if (secondIsInvalid) throw new IllegalArgumentException("Second is invalid");
    }
    private static void validateMinutes(int minutes){
        boolean minutesIsInvalid = minutes > 59 || minutes < 0;
        if (minutesIsInvalid) throw new IllegalArgumentException("Minutes is invalid");
    }
    private static void validateHour(int hour){
        boolean hourIsInvalid = hour > 23 || hour < 0;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is invalid");
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }
    public int getSecond() {
        return second;
    }

}