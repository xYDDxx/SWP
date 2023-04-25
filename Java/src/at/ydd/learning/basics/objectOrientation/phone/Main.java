package at.ydd.learning.basics.objectOrientation.phone;

public class Main {
    public static void main(String[] args) {
        SDCard SD1 = new SDCard(1000);
        SIM S1 = new SIM(1234,"06500428502");
        Camera C1 = new Camera(Camera.Resolution.HD);
        Phone P1 = new Phone("black", C1,S1,SD1);

        P1.takePicture();
    }
}
