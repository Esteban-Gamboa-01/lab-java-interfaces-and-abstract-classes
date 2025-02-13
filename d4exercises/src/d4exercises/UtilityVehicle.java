package d4exercises;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    //This constructor is overloading
    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getInfo(){
        return "The VIN Number is " + getVinNumber() +
                ".\nThe make is " + getMake() +
                ".\nThe model is " + getModel() +
                ".\nThe mileage is " + getMileage() +
                ".\nThe four-wheel drive " + isFourWheelDrive() + ".\n";
    }
}
