package ArrayPractice;

public class main {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 4, 5, 3, 4 }, { 4, 6, 54, 3, 2, 33 } };
        diagonalOperation(matrix);
    }

    public static void diagonalOperation(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i] + "");
            sum += matrix[i][i];
        }
        System.out.println("total sum of diagonal " + sum);
    }

    public static void findElemet(int[][] matrix, int target) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("value " + target + "founded at row" + i + "ccolumn " + j);
                    found = true;
                    break;

                }
            }
        }
        if (!found) {
            System.out.println("Element not present in matrix");

        }
    }
}
