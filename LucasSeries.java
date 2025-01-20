import java.util.Scanner;
public class LucasSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 2;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i = 3; i<=n; i++){
            int next = first + second;
            first = second;
            second = next;
            System.out.println(next);
        }
    }
}


