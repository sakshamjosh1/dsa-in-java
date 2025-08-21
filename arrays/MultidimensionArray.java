import java.util.*;
public class MultidimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // /* 
        //     1 2 3 
        //     4 5 6
        //     7 8 9
        //  */
        // int[][] arr = new int[3][3];

        // int[][] arr2 = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // int[][] arr3 = {
        //     {1,2,3},    //0th Index
        //     {4,5},      //1st Index
        //     {6,7,8,9}   //2nd Index
        // };

        int[][] arr4 = new int[3][3];
        System.out.println(arr4.length);  //no of rows

        //taking inputs of multidimensional arrays
        for(int row=0; row<arr4.length; row++){
            //for each column in every row
            for(int col=0; col < arr4[row].length; col++){
                arr4[row] [col] = input.nextInt();
            }
        }

        //output
        for(int row=0; row<arr4.length; row++){
            //for each column in every row
            for(int col=0; col < arr4[row].length; col++){
                System.out.print(arr4[row][col]);
            }
            System.out.println();
        }
        
    }
}
