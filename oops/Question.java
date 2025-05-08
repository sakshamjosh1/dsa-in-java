class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }  
}

class Child extends Parent{
    static{
        System.out.println("Child Static Block");
    }
    {
        System.out.println("Child Instance Initializer Block");
    }
    Child(){
        System.out.println("Child Constructor");
    }
}


public class Question {
    public static void main(String[] args) {
        System.out.println("Main Method Start");
        Child obj = new Child();
        System.out.println("Main method End");
    }
}
