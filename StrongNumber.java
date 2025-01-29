import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int sum = 0;
        int temp = n;
        int fact;
        while (temp != 0) {
            rem = temp%10;
            fact = 1;
            for(int i = 1; i<=rem; i++){
                fact = fact * i;
            }
                 
            sum = sum+fact;
            temp = temp/10;
        }
        if(n == sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }
}
