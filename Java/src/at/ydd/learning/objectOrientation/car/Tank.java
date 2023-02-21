package at.ydd.learning.objectOrientation.car;

public class Tank {
    public int tankVolume;
    public int fuelAmount;

    public Tank(int tankVolume, int fuelAmount) {
        this.tankVolume = tankVolume;
        this.fuelAmount = fuelAmount;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}
