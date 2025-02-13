package d4exercises;

public class Sedan extends Car{
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public String getInfo(){
        return "The VIN Number is " + getVinNumber() +
                ".\nThe make is " + getMake() +
                ".\nThe model is " + getModel() +
                ".\nThe mileage is " + getMileage() + ".\n";
    }
}
