public class Numbers {
    private int a;
    private int b;

    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    
    public void sum() {
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Numbers object1 = new Numbers();

        object1.setA(5);
        object1.setB(4);

        object1.sum();
        object1.sub();
    }
}
