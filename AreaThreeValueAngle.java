import java.util.Scanner;

public class AreaThreeValueAngle {
    public static void main(String[] args) {
        double a, b, c, s, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Three Values");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Result is = "+area);
    }
}
