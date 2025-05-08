interface vehicle{
    //Abstract method defined
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed is "+ speed + " gear is on "+ gear);
        
    }
}
class Bike implements vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed is "+ speed + " gear is on "+ gear);
        
    }
}
public class Interface {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.print("Bicycle present state : ");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        
        System.out.print("Bike present state : ");
        bike.printStates();
    }
}
