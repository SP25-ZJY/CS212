package lecture_note_8_9.matrix;

public class MatrixTest {
    /**
     * Main method for testing the Matrix class.
     */
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] array2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix m1 = new Matrix(array1);
        Matrix m2 = new Matrix(array2);

        System.out.println("Matrix 1:");
        System.out.println(m1);

        System.out.println("Matrix 2:");
        System.out.println(m2);

        m1.add(m2);

        System.out.println("After Addition:");
        System.out.println(m1);
    }
}
