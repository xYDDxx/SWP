package at.ydd.learning.basics.objectOrientation.remote;


import at.ydd.learning.objectOrientation.car.Tire;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;
    private int Status;

    public void getStatus() {
        for (int i = 0; i <= 1; i++) {
            Status += this.batteries.get(i).getBatteryState();
        }
        Status = Status / 2;
        System.out.println("Du hast einen Akkustand von: " + Status + "%");
    }

    public void turnOn() {
        for (int i = 0; i <= 1; i++) {
            Status = this.batteries.get(i).getBatteryState() - 5;
            System.out.println("Verbraucher " + (i + 1) + " angeschlossen");
        }
        System.out.println("Die Fernbedienung wurde eingeschalten, dein neuer Akkustand beträgt: " + Status + "%");
    }

    public void turnOff() {
        for (int i = 0; i <= 1; i++) {
            System.out.println("Verbraucher " + (i + 1) + " wurde getrennt");
        }
    }


    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }
}
