import java.util.Scanner;

public class DivisionSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;
        for(double i = 1; i<=n; i++){
            sum = sum + (1/i);
        }
        System.out.println(String.format("%.2f", sum));
        sc.close();
    }
}
