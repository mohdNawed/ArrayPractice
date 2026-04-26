// package ArrayPractice;

// public class twoDColSum {
// public static void main(String[] args) {
// int matrix[][] = { { 7, 37, 34, 55 }, { 23, 23, 4, 66 } };
// for (int j = 0; j < matrix[0].length; j++) {
// int sum = 0;
// for (int i = 0; i < matrix.length; i++) {
// sum += matrix[i][j];
// }
// System.out.println("Column " + j + " Sum " + sum);
// }

// }
// }

package ArrayPractice;

public class twoDColSum {
    public static void main(String[] args) {
        int matrix[][] = { { 7, 37, 34, 55 }, { 23, 23, 4, 66 } };

        for (int j = 0; j < matrix[0].length; j++) { // columns
            int sum = 0;

            for (int i = 0; i < matrix.length; i++) { // rows
                sum += matrix[i][j];
            }

            System.out.println("Column " + j + " Sum = " + sum);
        }
    }
}