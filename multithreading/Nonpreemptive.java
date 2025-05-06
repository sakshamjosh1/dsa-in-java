//Non-preemptive Scheduling example

class ThreadA extends Thread{
    String name;
    public ThreadA(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " Started..");
        for(int i=0; i<2; i++){
            System.out.println(name + " Running step " + i);
        }
        System.out.println(name + " Completed...");
    }
    
}

public class Nonpreemptive {
    public static void main(String[] args)throws InterruptedException {
        ThreadA t1 = new ThreadA("Task 1");
        ThreadA t2 = new ThreadA("Task 2");
        ThreadA t3 = new ThreadA("Task 3");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
