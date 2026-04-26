package ArrayPractice;

public class main {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 4, 5, 3, 4 }, { 4, 6, 54, 3, 2, 33 } };
        diagonalOperation(matrix);

        // student original = new student("Nawed", 29);
        // student copy = new student(original);

        // System.out.println("Original: " + original.name + " " + original.id);
        // System.out.println("Copy: " + copy.name + " " + copy.id);
        main obj = new main();
        student original = obj.new student("Nawed", 29);
        student copy = obj.new student(original);
        System.out.println(original);

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

    public class student {
        String name;
        int id;

        public student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public student(student other) {
            this.name = other.name;
            this.id = other.id;
        }

    }

}
