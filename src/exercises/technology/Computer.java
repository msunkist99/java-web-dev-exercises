package exercises.technology;

public class Computer {
    private String owerName;
    private int batteryLife;
    private int batteryRemaining;

    public int getId() {
        return id;
    }

    private int id = 0;

    //constructor
    public Computer(int batteryLife){
        this.batteryLife = batteryLife;
        this.batteryRemaining = batteryLife; //assume full battery when computer is created
        this.id = AbstractEntity.getId();
    }

    public String getOwerName() {
        return owerName;
    }

//    public void setOwerName(String owerName) {
//        this.owerName = owerName;
//    }

    public int getBatteryLife() {
        return batteryLife;
    }

//    public void setBatteryLife(int batteryLife) {
//        this.batteryLife = batteryLife;
//    }

    public int getBatteryRemaining() {
        return batteryRemaining;
    }

//    public void setBatteryRemaining(int batteryRemaining) {
//        this.batteryRemaining = batteryRemaining;
//    }

    public void registerOwner(String ownerName) {
        this.owerName = ownerName;
    }

    public void logBatteryUse(int hours) {
        this.batteryRemaining = this.batteryRemaining - hours;
    }
}
