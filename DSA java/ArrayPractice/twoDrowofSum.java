package ArrayPractice;

public class twoDrowofSum {
    public static void main(String[] args) {
        int matrix[][] = { { 6, 78, 4 }, { 7, 67, 44 } };
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("row " + i + " sum  " + sum);
        }
    }
}
