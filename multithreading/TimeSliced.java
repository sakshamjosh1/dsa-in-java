//Time Sliced Scheduling - Preemptive Scheduling

class ThreadB extends Thread{
    String name;
    public ThreadB(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " Started...");
        for(int i=0; i<2; i++){
            System.out.println("Running Step "+ i);
        }
        try{
            Thread.sleep(1000);  // A short time-slice of 1 sec
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + "Completed...");
    }
}

public class TimeSliced {
    public static void main(String[] args) {
        ThreadB t1 = new ThreadB("Task1");
        ThreadB t2 = new ThreadB("Task2");
        ThreadB t3 = new ThreadB("Task3");

        t1.start();
        t2.start();
        t3.start();
    }
}
