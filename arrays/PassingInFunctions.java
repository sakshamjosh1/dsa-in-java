import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[3] = 99;
    }
}
