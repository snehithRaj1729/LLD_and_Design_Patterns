package WithCommandDesignPattern;

import WithoutCommandPattern.AirConditioner;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl myRemoteControl = new MyRemoteControl();

        myRemoteControl.setCommand(new TurnOnAcCommand(airConditioner));
        myRemoteControl.pressButton();
    }
}
