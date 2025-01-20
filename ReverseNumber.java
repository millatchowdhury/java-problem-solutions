import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int rev = 0;
        int rem;

        while(temp != 0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        System.out.println("Reverse Number is = "+rev);
    }
}