import java.util.Random;
import java.util.Scanner;

public class _39_ObjectOriented {
    public static void main(String[] args){

        // Object = An entity that holds data (attributes)
        //        = and can perform actions (methods)
        //          It is a reference data type

        Car car1 = new Car();
        Car car2 = new Car();


        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);


//        car.drive();
//        car.brake();


    }
}

class Car {

    // these are all known as attributes, as they are all a thing a car has.
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }
}



