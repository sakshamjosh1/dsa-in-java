class Employee{
    private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(5001);
        emp1.setName("Saksham");
        
        System.out.println("Employee ID: "+ emp1.getId());
        System.out.println("Employee Name: "+ emp1.getName());
    }
}