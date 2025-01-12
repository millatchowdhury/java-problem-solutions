import java.util.Scanner;

public class SumThreeAverage {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your first number");
                a = sc.nextInt();
            System.out.println("Enter your Second Number");
                b = sc.nextInt();
            System.out.println("Enter Your Third Number");
                c = sc.nextInt();

        double avg = (a+b+c)/3;

        System.out.println("The Average of three numbers are = "+avg);
    }
}
