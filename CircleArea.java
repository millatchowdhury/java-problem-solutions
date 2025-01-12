import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value");
        double r = sc.nextInt();
        double area = 3.1416*r*r;
        System.out.println("Circle Area is = "+area);
    }
}
