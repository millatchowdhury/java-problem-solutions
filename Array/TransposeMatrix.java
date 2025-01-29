import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][3];
        int[][] c = new int[2][3];

        System.out.println("Enter a matrix elements");
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a.length; col++){
                a[row][col] = sc.nextInt();
            }
        }
        System.out.println("A");
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a.length; col++){
                System.out.print(a[row][col]+" ");
            }
            System.out.println();
        }
        // transpose matrix calculation 
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a.length; col++){
                c[col][row] = a[row][col];
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");
        for(int row = 0; row<c.length; row++){
            for(int col = 0; col<c.length; col++){
                System.out.print(c[row][col]+" ");
            }
            System.out.println();
        }
    }
}