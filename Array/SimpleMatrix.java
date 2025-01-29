import java.util.Scanner;

public class SimpleMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrixA = new int[3][4];
        // Scanning Matrix A 
        System.out.println("Please Enter Matrix A Values");
        for(int row = 0; row<3; row++){
            for(int col = 0; col<4; col++){
                System.out.print(String.format("matrixA[%d][%d] = ", row, col));
                matrixA[row][col] = sc.nextInt();
            }
            System.out.println();
        }
        // Printing Matrix A 
        System.out.println("Printed Matrix A");
        for(int row = 0; row<3; row++){
            for(int col = 0; col<4; col++){
                System.out.print(matrixA[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println();

        // Scanning Matrix B 
        System.out.println("Please Enter Matrix B Values");
        int[][] matrixB = new int[3][4];
        for(int row = 0; row<3; row++){
            for(int col = 0; col<4; col++){
                System.out.print(String.format("matrixB[%d][%d] = ", row, col));
                matrixB[row][col] = sc.nextInt();
            }
            System.out.println();
        }

    

        // Printing Matrix B 
        System.out.println("Printed Matrix B");
        for(int row = 0; row<3; row++){
            for(int col = 0; col<4; col++){
                System.out.print(matrixB[row][col]+" ");
            }
            System.out.println();
        }

        
    }
}