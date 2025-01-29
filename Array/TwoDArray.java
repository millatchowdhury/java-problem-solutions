import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // print two dimensional array 
        // int[][] abc = {
        //     {10,20,30},
        //     {40,50,60},
        //     {70,80,90}
        // };

        // for(int row = 0; row<3; row++){
        //     for(int col = 0; col<3; col++){
        //         System.out.print(abc[row][col]+" ");
        //     }
        //     System.out.println();
        // }


        Scanner sc = new Scanner(System.in);
        int[][] abc = new int[3][4];

        for(int row = 0; row<3; row++){
            for(int col = 0; col<4; col++){
                System.out.print(String.format("abc[%d][%d] = ", row, col));
                abc[row][col] = sc.nextInt();
            }
        }

        System.out.println("Showing Array Data");

        for(int row = 0; row<3; row++){
            for(int col = 0; col<4; col++){
                System.out.print(abc[row][col]+" ");
            }
            System.out.println();
        }
    }
}
