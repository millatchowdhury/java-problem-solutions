import java.util.Scanner;

public class PossitiveNegative {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Possitive or Negative Number");
            number = sc.nextInt();
            if(number > 0){
                System.out.println("Possitive Number");
            }else if(number < 0){
                System.out.println("Negative Number");
            }else{
                System.out.println("You have entered Zero");
            }
    }
}

