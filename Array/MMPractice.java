import java.util.Scanner;

public class MMPractice {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int[][] b = new int[5][5];
        int[][] c = new int[5][5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Matrix row Number");
        int r1 = sc.nextInt();
        System.out.println("Enter First Matrix column Number");
        int c1 = sc.nextInt();
        System.out.println("Enter Second Matrix row Number");
        int r2 = sc.nextInt();
        System.out.println("Enter Second Matrix Column Number");
        int c2 = sc.nextInt();
        
        if(c1 == r2){
            System.out.println("Enter First Matrix Elements");
            // input first matrix 
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c1; col++){
                    a[row][col] = sc.nextInt();
                }
            }

            // input Second Matrix Elements
            System.out.println("Enter Second Matrix Elements");
            for(int row = 0; row<r2; row++){
                for(int col = 0; col<c2; col++){
                    b[row][col] = sc.nextInt();
                }
            }

            // print first matrix 
            System.out.println("First Matrix Elements");
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c1; col++){
                    System.out.print(a[row][col]+" ");
                }
                System.out.println();
            }

            // print second matrix 
            System.out.println("Second Matrix Element");
            for(int row = 0; row<r2; row++){
                for(int col = 0; col<c2; col++){
                    System.out.print(b[row][col]+" ");
                }
                System.out.println();
            }

            // multiplication calculation matrix 
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c2; col++){
                    for(int k = 0; k<c1; k++){
                        sum = sum + a[row][k] * b[k][col];
                    }
                    c[row][col] = sum;
                    sum = 0;
                }
            }

            // print result matrix 
            System.out.println("Multiplied Matrix");
            for(int row = 0; row<r1; row++){
                for(int col = 0; col<c2; col++){
                    System.out.print(c[row][col]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("They can't multiply");
        }
    }
}
