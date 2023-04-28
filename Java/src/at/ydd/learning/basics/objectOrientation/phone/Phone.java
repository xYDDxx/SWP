package at.ydd.learning.basics.objectOrientation.phone;

public class Phone {
    private String color;
    private Camera camera;
    private SIM sim;
    private SDCard sdcard;
    private String username;
    private int password;

    public enum State {Locked, Unlocked}

    public State state;

    public Phone(String color, Camera camera, SIM sim, SDCard sdcard, String username, int password, State state) {
        this.color = color;
        this.camera = camera;
        this.sim = sim;
        this.sdcard = sdcard;
        this.username = username;
        this.password = password;
        this.state = state;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void takePicture(String Filename) {
        if (state == State.Unlocked) {
            System.out.println("Taking Picture...");
            this.camera.makePicture(Filename);
        } else {
            System.out.println("ERROR! UNLOCK YOUR PHONE FIRST!");
        }

    }

    public void makeCall(String phoneNumber) {
        if (state == State.Unlocked) {
            this.sim.doCall(phoneNumber);
        } else {
            System.out.println("ERROR! UNLOCK YOUR PHONE FIRST!");
        }

    }

    public void unlockPhone(String username, int password) {
        if (this.username == username && this.password == password) {
            setState(State.Unlocked);
            System.out.println("PHONE UNLOCKED!");

        } else {
            System.out.println("ERROR! WRONG USERNAME OR PASSWORD");
        }
    }

    public void getFreeSpace(int freeSpace) {
        if (state == State.Unlocked) {
            this.sdcard.getFreeCapacity(freeSpace);
        } else {
            System.out.println("ERROR! UNLOCK YOUR PHONE FIRST!");
        }
    }

    public void printAllFiles() {
        if (state == State.Unlocked) {
            this.sdcard.getAllFiles();
        } else {
            System.out.println("ERROR! UNLOCK YOUR PHONE FIRST!");
        }
    }

}
