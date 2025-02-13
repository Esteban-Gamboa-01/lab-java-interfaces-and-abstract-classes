package d4exercises;

public class Truck extends Car {
    private double towingCapacity;

    //The constructor is overloading
    public Truck(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String getInfo(){
        return "The VIN Number is " + getVinNumber() +
                ".\nThe make is " + getMake() +
                ".\nThe model is " + getModel() +
                ".\nThe mileage is " + getMileage() +
                ".\nThe towing capacity is " + getTowingCapacity() + ".\n";
    }
}
