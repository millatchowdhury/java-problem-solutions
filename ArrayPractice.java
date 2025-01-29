

public class ArrayPractice {
    public static void main(String[] args) {

        String[][] name = {
            {"kamal", "jamal", "shahin"},
            {"Tania", "Ludu", "Moyna"},
            {"Shahnur", "Farid", "Ayub"},
            {"Shahnur", "Farid", "Ayub"}
        };

        for(int row = 0; row<4; row++){
            for(int col = 0; col<3; col++){
                System.out.print(name[row][col]+" ");
            }
            System.out.println();
        }

    }
}
