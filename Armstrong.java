import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int rev = 0;
        int rem;

        while(temp != 0){
            rem = temp%10;
            rev = rev+rem*rem*rem;
            temp = temp/10;
        }
        if(number == rev){
            System.out.println("This is armstrong Number");
        }else{
            System.out.println("This is not armstrong number");
        }
    }
}
