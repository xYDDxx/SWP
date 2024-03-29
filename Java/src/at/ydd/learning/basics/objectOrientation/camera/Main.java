package at.ydd.learning.basics.objectOrientation.camera;

public class Main {
    public static void main(String[] args) {
        Lens L1 = new Lens("Sony", 100);
        Manufacturer M1 = new Manufacturer("Sony", "Japan");
        SDCard SD1 = new SDCard(8);
        SDCard SD2 = new SDCard(8);
        Camera C1 = new Camera(800, "black", M1, Camera.Resolution.Medium);

        C1.addSDCard(SD1);
        C1.addLens(L1);

        C1.takePicture("Pic1", "2023-05-01");
        C1.setResolution(Camera.Resolution.Large);
        C1.takePicture("Pic1", "2023-05-01");
        C1.addSDCard(SD2);
        C1.takePicture("Pic1", "2023-05-01");
    }
}
