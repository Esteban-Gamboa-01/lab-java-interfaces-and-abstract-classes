package d4exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main {

    public static void main (String [] args){

        //Exercise01
        BigDecimal num01 = new BigDecimal(1.237653);
        BigDecimal num02 = new BigDecimal(-478.6743);

        System.out.println(roundHundredth(num01));
        System.out.println(roundHundredth(num02));
        System.out.println();

        System.out.println(signTenth(num01));
        System.out.println(signTenth(num02));

        //Exercise02
        System.out.println();

        /*
        If the class is not abstract, it applies:
        Car car01 = new Car("1536 MNN","Audi","A1",1000);
        System.out.println(car01.getInfo());
        */

        Car car01 = new Sedan("4637 JKl","Peugeot","607",5700);
        System.out.println(car01.getInfo());

        Car car02 = new UtilityVehicle("8395 FJS","Seat","Fiesta",15780, false);
        System.out.println(car02.getInfo());

        Car car03 = new Truck("1257 BCY","Citroen","C15",30600, 250.5);
        System.out.println(car03.getInfo());

        //Exercise03
        Video video01 = new TVSeries("Stranger Things", 340, 7);
        System.out.println(video01.getInfo());

        Video video02 = new Movie("The Greatest Showman", 96, 8.80);
        System.out.println(video02.getInfo());

        //Exercise04
        IntArrayList array01 = new IntArrayList();
        IntVector array02 = new IntVector();

        for(int i=0; i<23; i++){
            array01.add(i+1);
            // You can see the iteration step by step
            // System.out.println(Arrays.toString(array01.getArrayDefault()));
        }
        System.out.println(Arrays.toString(array01.getArrayDefault()));
        System.out.println();

        for(int i=0; i<21; i++){
            array02.add(2*i);
            // You can see the iteration step by step
            // System.out.println(Arrays.toString(array02.getArrayDefault()));
        }
        System.out.println(Arrays.toString(array02.getArrayDefault()));
    }

    public static double roundHundredth (BigDecimal number){
        double result;

        number = number.setScale(2, RoundingMode.HALF_UP);
        result = number.doubleValue();
        return result;
    }

    public static double signTenth (BigDecimal number){
        double result = 0.0;

        number = number.negate();
        number = number.setScale(1, RoundingMode.HALF_UP);
        result = number.doubleValue();
        return result;
    }


}
