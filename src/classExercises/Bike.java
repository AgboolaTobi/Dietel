package classExercises;

public class Bike {

    private String name;
    private boolean isOn;
    private int speed;

    public void powerOn() {
        if (!isOn) {
            isOn = true;
        } else {
            isOn = false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accelerate() {
        if (speed >= 41) speed = speed + 4;

        if ((speed >= 31) && (speed <= 40)) speed = speed + 3;

        if ((speed >= 21) && (speed <= 30)) speed = speed + 2;

        if ((speed >= 0) && (speed <= 20)) speed = speed + 1;


    }

    public void decelerate() {
        if (speed >= 41)
            speed = speed - 4;
        if ((speed > 31) && (speed <= 40))
            speed = speed - 3;
        if ((speed >= 21) && (speed <= 30))
            speed = speed - 2;
        if ((speed >= 0) && (speed < 20))
            speed = speed - 1;
    }

    public int  checkGear() {

        if ((speed >= 0) && (speed <= 20)) return 1;

        if ((speed > 20) && (speed <= 30)) return 2;

        if((speed>30) && (speed<=40)) return 3;

        if ((speed>40)) return 4;

        return 0;
    }


    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}