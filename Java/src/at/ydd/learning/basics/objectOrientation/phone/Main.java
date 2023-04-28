package at.ydd.learning.basics.objectOrientation.phone;

public class Main {
    public static void main(String[] args) {
        SDCard SD1 = new SDCard(1000);
        SIM S1 = new SIM(1234, "06500428502");
        Camera C1 = new Camera(Camera.Resolution.HD, SD1);
        Phone P1 = new Phone("black", C1, S1, SD1, "YDD", 1234, Phone.State.Locked);


        P1.unlockPhone("YDD", 1234);
        P1.takePicture("Pic1");
        P1.takePicture("Pic3");
        P1.printAllFiles();
        P1.makeCall("04035934502");
        P1.getFreeSpace(100);
    }
}
