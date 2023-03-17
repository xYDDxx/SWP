package at.ydd.learning.basics.objectOrientation.lamp;

public class main {
    public static void main(String[] args) {

        LampElement le1 = new LampElement("LED1","Red",5, LampElement.State.Off);
        LampElement le2 = new LampElement("LED2","Blue",6, LampElement.State.Off);

        Lamp l1 = new Lamp();
        l1.addLampElement(le1);
        l1.addLampElement(le2);

        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();

    }
}
