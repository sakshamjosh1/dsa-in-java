import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0){
            int l = n%10;
            sum+=l;
            product*=l;
            n = n/10;
        }
        System.out.println(product-sum);
    }   
}
