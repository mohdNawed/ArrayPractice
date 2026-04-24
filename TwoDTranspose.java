package ArrayPractice;

public class TwoDTranspose {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 3 }, { 2, 5, 7 } };
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
