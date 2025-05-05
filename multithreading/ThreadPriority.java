class ThreadA extends Thread{
    public void run(){
        System.out.println("Thread A started...");
        for(int i=0; i<2; i++){
            System.out.println("From thread A i="+i);
        }
        System.out.println("Exit from Thread A");
    }
}
class ThreadB extends Thread{
    public void run(){
        System.out.println("Thread B started...");
        for(int j=0; j<2; j++){
            System.out.println("From thread B j="+j);
        }
        System.out.println("Exit from Thread B");
    }
}
class ThreadC extends Thread{
    public void run(){
        System.out.println("Thread C started...");
        for(int k=0; k<2; k++){
            System.out.println("From thread C k="+k);
        }
        System.out.println("Exit from Thread C");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(t1.getPriority()+1);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
