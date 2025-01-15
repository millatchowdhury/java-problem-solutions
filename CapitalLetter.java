import java.util.Scanner;


public class CapitalLetter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Charecter");
        char ch = sc.nextLine().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("This is Capital number");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("This is Small letter");
        }else{
            System.out.println("This is not a number");
        }
        sc.close();
    }
}
