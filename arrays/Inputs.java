import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 42;
        arr[3] = 65;
        arr[4] = 21;
        System.out.println(arr[3]);

        //Input using for loops
        for (int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        //Print the array
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //Enhanced for loop
        for(int num : arr){
            System.out.println(num+" ");
        }
    }
}
