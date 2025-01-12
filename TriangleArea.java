import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Number");
        int base = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        double area = .5*base*height;
        System.out.println("Triangle Area is = "+area);
    }
}
