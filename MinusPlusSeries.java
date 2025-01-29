import java.util.Scanner;

public class MinusPlusSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int oddResult = 0;
        // for(int i = 1; i<=n; i+=2){
        //     oddResult = oddResult+i;
        // }
        // int evenResult = 0;
        // for(int i = 2; i<=n; i+=2){
        //     evenResult = evenResult+i;
        // }
        // int result = oddResult - evenResult;
        // System.out.println(result);

        // Another Way
        int result = 0;
        int odd = 0, even = 0;
        for(int i = 1; i<=n; i++){
            if(i%2==0){
                even = even+i;
            }
            else{
                odd = odd + i;
            }
        }
        sc.close();
        result = odd - even;
        System.out.println(result);
    }
}
