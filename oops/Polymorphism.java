//Java program to demonstrate method overloading and overriding

class Parent{
    //Overloading
    public void func(){
        System.out.println("Parent.func()");
    }

    public void func(int a){
        System.out.println("Parent.func(int a)"+ a);
    }
}

//Overriding
class Child extends Parent{
    public void func(int a){
        System.out.println("Child.func(int):"+ a);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Child child1 = new Child();
    
        //dynamic dispatch
        Parent polymorphicObj = new Child();
    
        //Method Overloading
        parent1.func();
        parent1.func(10);
    
        //Method Overriding
        child1.func(20);
    
        //Polymorphism
        polymorphicObj.func(30);
    }
   
}
