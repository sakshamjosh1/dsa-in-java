//Demonstration of constructor overloading

class EmpDetails{

    int id;
    String name;
    int salary;

    EmpDetails(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    EmpDetails(int id, String name){
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    void DisplayInfo() {
        System.out.println("Employee ID is :" + id);
        System.out.println("Employee name is :"+ name);
        System.out.println("Employee salary is :" + salary);
        System.out.println();
    }
}


public class Employees2 {
    public static void main(String[] args) {
        EmpDetails emp1 = new EmpDetails(5001, "Saksham");
        EmpDetails emp2 = new EmpDetails(5002, "Rohan", 15000);

        emp1.DisplayInfo();
        emp2.DisplayInfo();
    }
}
