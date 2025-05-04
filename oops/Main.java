class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public void printStudent(String header){
        System.out.println(header);
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class Main{
    public static void main(String[] args) {
        Student stu1 = new Student(1001, "Saksham");
        stu1.printStudent("The details of the student are: ");
    }
}
