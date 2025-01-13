import java.util.Scanner;

public class QuardraticEcuation {

    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = Math.sqrt(b*b-4*a*c);
        x1 = (-b+d)/(2*a);
        x2 = (-b-d)/(2*a);
        System.out.println(x1 + " " + x2);
    }
}
