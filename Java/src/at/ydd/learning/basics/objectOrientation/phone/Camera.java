package at.ydd.learning.basics.objectOrientation.phone;
import java.util.ArrayList;

public class Camera {
    public enum Resolution {HD,FullHD,UHD}
    public Resolution resolution;
    private SDCard sdcard;


    public Camera(Resolution resolution, SDCard sdcard) {
        this.resolution = resolution;
        this.sdcard = sdcard;
    }


    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public SDCard getSdcard() {
        return sdcard;
    }

    public void setSdcard(SDCard sdcard) {
        this.sdcard = sdcard;
    }

    public void makePicture(String Filename){
        int size = 0;
        if (this.resolution==Resolution.HD){
            size = 10;
        }else if(this.resolution==Resolution.FullHD){
            size = 50;
        }else if(this.resolution==Resolution.UHD){
            size = 100;
        }
        System.out.println("Making Picture ... Checking Capacity");
        if (size<=this.sdcard.getCapacity()){
            String FileName = Filename;
            PhoneFile PF1 = new PhoneFile("jpg",10,FileName);
            this.sdcard.setCapacity(this.sdcard.getCapacity()-size);
            this.sdcard.saveFile(PF1);
        }else {
            System.out.println("Not enough capacity available on your SDCard");
            System.out.println("Try to get free space");
        }

    }
}
