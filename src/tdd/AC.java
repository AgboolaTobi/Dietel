package tdd;

public class AC {

    private boolean isOn;
    private int temperature = 16;


    public void powerOn() {
        if (!isOn) {
            isOn = true;
        } else {
            isOn = false;
        }
    }

    public void increaseTemperature() {
        if (temperature <= 30){
            this.temperature = temperature + 1 ;
        }
        else if ((temperature) > 30) {
            System.out.println("Temperature cannot be increased beyond 30");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature = temperature - 1;
            {
                if (temperature < 16) {

                    System.out.println("Temperature cannot be decreased below 16!");

                }

            }
        }


    }
    public int temperature() {
        return temperature;

    }

    public boolean isOn() {

        return isOn;
    }

}