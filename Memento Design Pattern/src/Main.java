//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(10,20);
        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapshot1);

        configurationOriginator.setHeight(50);
        configurationOriginator.setWidth(60);

        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();

        configurationCareTaker.addMemento(snapshot2);

        configurationOriginator.setHeight(70);
        configurationOriginator.setWidth(80);

        ConfigurationMemento restoreObject = configurationCareTaker.undo();
        configurationOriginator.restoreMemento(restoreObject);

        System.out.println("Height: "+configurationOriginator.height+" Width: "+configurationOriginator.width);
    }
}