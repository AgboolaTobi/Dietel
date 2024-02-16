package tdd;

public class AC {


    private boolean isOn = false;
    private int temperature = 16;


    public void powerOn() {
        isOn = true;
    }

    public void powerOff(){
        isOn = false;
    }

    public void increaseTemperature() {
        if (temperature <= 30){
            this.temperature = temperature + 1 ;
        }
        else {
            System.out.println("Temperature cannot be increased beyond 30");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature = temperature - 1;
        }


    }

    public boolean isOn() {

        return isOn;
    }

}