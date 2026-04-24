package ArrayPractice;

public class TwoFindMax {
    public static void main(String[] args) {
        int matrix[][] = { { 57, 86, 33, 66, 22 }, { 33, 44, 558, 77, 6 } };
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Value of array Max " + max);
    }
}
