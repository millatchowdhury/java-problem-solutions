import java.util.Scanner;

public class OneTo100ScSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i*i;
        }
        System.out.println(sum);
        sc.close();
    }
}


