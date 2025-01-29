import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        int rem;
        while(temp != 0){
            rem = temp % 10;
            sum = sum + rem;
            temp = temp/10;
        }
        System.out.println("Sum of Digit is = "+sum);
    }
}