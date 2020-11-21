package exercises.technology;

public class SmartPhone extends Computer{
    private String carrier;

    //constructor
    public SmartPhone(int batteryLife, String carrier){
        super(batteryLife);
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

//    public void setCarrier(String carrier) {
//        this.carrier = carrier;
//    }

    public boolean makeCall(){
        if (this.carrier.isBlank()){
            return false;
        }
        return true;
    }
}
