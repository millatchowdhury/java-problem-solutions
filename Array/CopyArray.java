import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[5];
        for(int i = 0; i<age.length; i++){
            age[i] = sc.nextInt();
        }
        int[] age2 = new int[5];
        for(int k = 0; k<age2.length; k++){
            age2[k] = age[k];
        }

        for(int j = 0; j<age.length; j++){
            System.out.print(age2[j]+" ");
        }
    }
}
