
import java.util.Scanner;

public class GCDLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // set here 
        int n1 = num1;
        int n2 = num2;
        int rem;
        try {
            while(n1 != 0){
                rem = n1 % n2;
                n1 = n2;
                n2 = rem;
            }
        } catch (Exception e) {
            System.out.println("Not an exception");
        }
        
        int gcd = n1;

        // GCD Calculated 

        int lcm = num1 * num2 / gcd;
        System.out.println("GCD ="+gcd+" And LCM = "+lcm);



    }
}
