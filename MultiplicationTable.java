import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        for(int i = 1; i<=10; i++){
            int result = number*i;
            // System.out.printf("%d X %d = %d \n", number, i, number*i);
            System.out.println(number + " x " + i + " = " + result);
        }
        sc.close();
    }
}
