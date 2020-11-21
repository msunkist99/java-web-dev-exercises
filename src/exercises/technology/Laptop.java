package exercises.technology;

public class Laptop extends Computer {
    private int hardDriveSize;
    private int hardDriveRemaining;

    //constructor
    public Laptop(int batteryLife, int hardDriveSize){
        super(batteryLife);
        this.hardDriveSize = hardDriveSize;
        this.hardDriveRemaining = hardDriveSize;  // assume harddrive is empty
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

//    public void setHardDriveSize(int hardDriveSize) {
//        this.hardDriveSize = hardDriveSize;
//    }

    public int getHardDriveRemaining() {
        return hardDriveRemaining;
    }

//    public void setHardDriveRemaining(int hardDriveRemaining) {
//        this.hardDriveRemaining = hardDriveRemaining;
//    }

    public void saveFile(int fileSize){
        this.hardDriveRemaining -= fileSize;
    }
}
