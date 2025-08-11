import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = input.next();
        System.out.println("How are you doing " + name);
    }
}
