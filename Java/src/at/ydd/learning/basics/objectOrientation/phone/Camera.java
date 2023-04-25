package at.ydd.learning.basics.objectOrientation.phone;
import java.util.ArrayList;

public class Camera {
    public enum Resolution {HD,FullHD,UHD}
    public Resolution resolution;


    public Camera(Resolution resolution) {
        this.resolution = resolution;
    }


    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public PhoneFile makePicture(){
        PhoneFile PF1 = new PhoneFile("jpg",10,"Picture");
        return PF1;
    }
}
