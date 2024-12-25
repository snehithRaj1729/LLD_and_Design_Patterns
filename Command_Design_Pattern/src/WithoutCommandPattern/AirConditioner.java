package WithoutCommandPattern;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void turnOffAc(){
        this.isOn=false;
    }

    public void turnOnAc(){
        this.isOn=true;
    }
}
