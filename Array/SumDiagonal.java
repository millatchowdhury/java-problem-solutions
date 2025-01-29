public class SumDiagonal {
    public static void main(String[] args) {
        int sum = 0;
        int[][] a = {
            {2,3,4},
            {5,6,7},
            {2,5,7}
        };
        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                if(row == col){
                    sum = sum+a[row][col];
                }
            }
        }
        System.out.println(sum);
    }
}
