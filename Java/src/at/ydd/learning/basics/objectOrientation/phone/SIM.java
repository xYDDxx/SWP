package at.ydd.learning.basics.objectOrientation.phone;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void sim(){
        System.out.println("ID: " + id);
        System.out.println("Number: " + number);
    }

    public void doCall(String phoneNumber){
        System.out.println("Calling " + phoneNumber + " ...");
    }
}
