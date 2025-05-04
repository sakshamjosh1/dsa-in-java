class Animal{
    void Eat(){
        System.out.println("Animal is Eating...");
    }
    void Sleep(){
        System.out.println("Animal is Sleeping...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking...");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        //Inherited traits from parent class
        myDog.Eat();
        myDog.Sleep();

        //Child class own method
        myDog.bark();
    }
}
