abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

    void startEngine(){
        System.out.println("Engine started!");
    }
}

class Car extends Vehicle{
    void accelerate(){
        System.out.println("Car: pressing gas pedal");
    }

    void brake(){
        System.out.println("Car: applying breaks");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Vehicle mycar1 = new Car();
        mycar1.startEngine();
        mycar1.accelerate();
        mycar1.brake();
    }
}
