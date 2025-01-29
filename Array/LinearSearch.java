import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int position = -1;
        int[] num = {10,2,30,15,28,5};
        for(int i = 0; i<num.length; i++){
            if(value == num[i]){
                position = i+1;
                break;
            }
        } 
        if(position == -1){
            System.out.println("Not Found !");
        }else{
            System.out.println("The position of "+value+" is "+position);
        }

    }
}
