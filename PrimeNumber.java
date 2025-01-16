import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = sc.nextInt();
        int count = 0;
        for(int i=2; i<number; i++){
            if(number%i==0){
                System.out.println(number + " Is a not a prime Number");
                count++;
                break;
            }
            
        }
        if(count == 0){
            System.out.println(number + " Is a Prime Number");
        }
    }
}
