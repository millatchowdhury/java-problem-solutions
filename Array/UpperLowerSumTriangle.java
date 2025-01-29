public class UpperLowerSumTriangle {

    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {2,3,4},
            {5,6,7}
        };
        int upperSum = 0;
        int lowerSum = 0;

        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a.length; col++){
                if(row<col){
                    upperSum = upperSum + a[row][col];
                }
                if(row>col){
                    lowerSum = lowerSum + a[row][col];
                }
            }
        }
        System.out.println("uppersome = " + upperSum);
        System.out.println("lowersome = " + lowerSum);
    }
}
