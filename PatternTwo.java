import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = n; row>=1; row--){
            for(int col = 1; col<=row; col++){
                System.out.print(row+" ");
                // System.out.print(col+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
