import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];

        int r1, c1, r2, c2, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Matrix Row Number");
        r1 = sc.nextInt();
        System.out.println("First Matrix Column Number");
        c1 = sc.nextInt();
        System.out.println("Enter Second Matrix Row Number");
        r2 = sc.nextInt();
        System.out.println("Enter Second Matrix Column Number");
        c2 = sc.nextInt();
        if(c1 == r2){
            // first matrix data input
            System.out.println("Enter First Matrix Data");
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c1; col++){
                    a[row][col] = sc.nextInt();
                }
            }
            
            // second matrix data input 
            System.out.println("Enter Second Matrix Data");
            for(int row = 0; row<r2; row++){
                for(int col = 0; col<c2; col++){
                    b[row][col] = sc.nextInt();
                }
            }
            
             // print first matrix 
            System.out.println("First Matrix");
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c1; col++){
                    System.out.print(a[row][col]+" ");
                }
                System.out.println();
            }
            // print second matrix 
            System.out.println("Second Matrix");
            for(int row = 0; row<r2; row++){
                for(int col = 0; col<c2; col++){
                    System.out.print(b[row][col]+" ");
                }
                System.out.println();
            } 
            
            // calculation of third matrix 
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c2; col++){
                    for(int k = 0; k<c1; k++){
                        sum = sum + (a[row][k] * b[k][col]);
                    }
                    c[row][col] = sum;
                    sum = 0;
                }
            }
            // print c matrix 
            System.out.println("Result Matrix");
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c2; col++){
                    System.out.print(c[row][col]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Error. They are not possible for multiplication");
        }
    }
}
