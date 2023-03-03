package at.ydd.learning.basics.objectOrientation.remote;


import at.ydd.learning.objectOrientation.car.Tire;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;


    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery){this.batteries.add(battery);}

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }
}
