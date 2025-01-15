import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        System.out.println("Enter Your Numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.printf("Largest Number is = %d ", num1);
        }else if(num1 < num2){
            System.out.printf("Smallest Number is = %d ", num1);
        }else{
            System.out.println("These are equal numbers");
        }
    }
}
