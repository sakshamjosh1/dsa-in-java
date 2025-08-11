import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit of Fibonacci series :");
        int limit = input.nextInt();
        int f = 0;
        int s = 1;
        System.out.println(f);
        System.out.println(s);
        for(int i = 2; i<limit; i++){
            int t = f+s;
            f = s;
            s = t;
            System.out.println(t);
        }   
           
    }
}
