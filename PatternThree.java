import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int row = 1; row<=n; row++){
        //     for(int col = 1; col<=row; col++){
        //         System.out.print(col+" ");
        //     }
        //     System.out.println();
        // }
        // for(int row = n; row>=1; row--){
        //     for(int col = 1; col<=row; col++){
        //         System.out.print(col+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int row = n-1; row>=1; row--){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
