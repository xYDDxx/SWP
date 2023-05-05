package at.ydd.learning.basics.objectOrientation.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LampElement> lamps;
    private String Status;
    private double powerUsage;

    public Lamp() {
        this.lamps = new ArrayList<>();
    }

    public void addLampElement(LampElement lamp) {
        this.lamps.add(lamp);
    }

    public void turnAllOn() {
        for (int i = 0; i < lamps.size(); i++) {
            this.lamps.get(i).setState(LampElement.State.On);
            System.out.println("Glühelement" + (i + 1) + " wurde eingeschalten");
        }
        System.out.println("Alle Glühelemente wurden eingeschalten");
    }

    public double getOverallPowerUsage() {
        for (int i = 0; i < lamps.size(); i++) {
            powerUsage += this.lamps.get(i).getConsumption();
        }
        System.out.println("Bisher wurden " + powerUsage + "W verbraucht");
        return powerUsage;
    }

    public void printNamesOfLightElements() {
        for (int i = 0; i < lamps.size(); i++) {
            System.out.println(lamps.get(i).getName());
        }
    }
}
