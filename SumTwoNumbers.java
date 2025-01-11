import java.util.Scanner;

public class SumTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.printf("Summation of %d + %d = %d", num1, num2, sum);
        

    }
}