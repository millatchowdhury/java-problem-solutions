import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter width");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Rectangle Area Is = "+area);
    }
}
