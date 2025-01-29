import java.util.Scanner;

public class FibonacciArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[30];

        System.out.println("How many fibonacci numbers do you want : ");
        a[0] = 0;
        a[1] = 1;

        for(int i = 2; i<n; i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int i = 0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}