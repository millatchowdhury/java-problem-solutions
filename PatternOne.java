import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");
                // System.out.print(row+" ");
                // System.out.print(row%2+" ");
                // System.out.print(col%2+" ");
                // System.out.print(String.format("%c ", col+64));
                // System.out.print(String.format("%c ", row+64));
                // System.out.print(String.format("%c ", row+96));
                // System.out.print(String.format("%c ", col+96));
                // System.out.print(String.format("# "));
                // System.out.print(String.format("* "));
                // System.out.print(String.format("@ "));
            }
            System.out.println();
        }
    }
}

