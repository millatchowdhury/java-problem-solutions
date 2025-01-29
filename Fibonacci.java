import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int fibo = 0;
        int first = 0;
        int second = 1;
        while (count<n) {
            if(count<=1){
                fibo = count;
            }else{
                fibo = first + second;
                first = second;
                second = fibo;
            }
            System.out.println(fibo);
            count++;
        }
    }
}
