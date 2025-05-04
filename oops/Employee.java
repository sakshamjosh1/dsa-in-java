public class Employee {
    private String name;
    private float salary;

    //constructor
    public Employee(String name, float salary){
        this.name=name;
        this.salary=salary;
    }

    //getters
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

    //setters
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public void DisplayDetails(){
        System.out.println("Employee:"+ name);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Saksham", 150000.50f);
        emp1.DisplayDetails();
    }
}
