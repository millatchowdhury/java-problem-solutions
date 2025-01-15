import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year Number");
        int learYear = sc.nextInt();
        if(learYear % 400 == 0){
            System.out.println("Yes, This is learp year");
        }else if(learYear % 4 == 0 && learYear % 100 != 0){
            System.out.println("Yes, This is leap Year");
        }else{
            System.out.println("This is not leap year");
        }
    }
}
