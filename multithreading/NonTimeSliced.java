//Non-Time Sliced Preemptive Scheduling 

class ThreadC extends Thread{
    String name;
    public ThreadC(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " started");
        for(int i=0; i<2; i++){
            System.out.println("Running step " + i);
            Thread.yield();   //Gives another thread chance to run
        }
        System.out.println(name + " completed");
    }

}
public class NonTimeSliced {
    public static void main(String[] args) {
        ThreadC t1 =new ThreadC("Task1");
        ThreadC t2 =new ThreadC("Task2");
        ThreadC t3 =new ThreadC("Task3");

        t1.start();
        t2.start();
        t3.start();
    }
}
