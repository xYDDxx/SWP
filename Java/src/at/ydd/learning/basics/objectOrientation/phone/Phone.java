package at.ydd.learning.basics.objectOrientation.phone;

public class Phone {
    private String color;
    private Camera camera;
    private SIM sim;
    private SDCard sdcard;

    public Phone(String color, Camera camera, SIM sim, SDCard sdcard) {
        this.color = color;
        this.camera = camera;
        this.sim = sim;
        this.sdcard = sdcard;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public SDCard getSdcard() {
        return sdcard;
    }

    public void setSdcard(SDCard sdcard) {
        this.sdcard = sdcard;
    }

    public void takePicture(){
        this.camera.makePicture();
    }
}
