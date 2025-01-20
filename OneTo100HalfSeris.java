import java.util.Scanner;

public class OneTo100HalfSeris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;
        for(double i = 1.5; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
