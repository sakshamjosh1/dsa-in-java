class Table{
    synchronized void printTable(int n){
        for(int i=1; i<3; i++){
            System.out.print(n*i + "\t");
            try{
                Thread.sleep(400);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class ThreadA extends Thread{
    Table t;
    ThreadA(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class ThreadB extends Thread{
    Table t;
    ThreadB(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        Table obj = new Table();
        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);

        t1.start();
        t2.start();
    }
}
