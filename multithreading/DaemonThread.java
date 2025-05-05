
class BackgroundTask extends Thread{
    public void run(){
        while(true){
            try{
                System.out.println("Background app is running...");
                Thread.sleep(2000); 
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        BackgroundTask bt = new BackgroundTask();
        bt.setDaemon(true);
        bt.start();
        System.out.println("Main thread finished");
    }
}
