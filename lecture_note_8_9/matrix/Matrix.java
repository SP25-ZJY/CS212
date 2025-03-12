package lecture_note_8_9.matrix;

/**
 * Matrix class to represent and manipulate a 2D array.
 * CS 212 - Multidimensional Arrays
 *
 * @author [Your Name]
 * @version 1.0
 */
public class Matrix {
    private int[][] data;

    /**
     * Constructor to initialize a matrix with given rows and columns.
     * @param rows Number of rows in the matrix.
     * @param cols Number of columns in the matrix.
     */
    public Matrix(int rows, int cols) {
        data = new int[rows][cols];
    }

    /**
     * Constructor to initialize a matrix with an existing 2D array.
     * @param array The 2D array to use as matrix data.
     */
    public Matrix(int[][] array) {
        data = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, data[i], 0, array[i].length);
        }
    }

    /**
     * Adds another matrix to this matrix.
     * @param other The matrix to add.
     */
    private void add(int[][] other) {
        if (this.data.length != other.length || this.data[0].length != other[0].length) {
            return;
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                this.data[i][j] += other[i][j];
            }
        }
    }

    public void add(Matrix other){
        add(other.data);
    }

    /**
     * Converts the matrix to a 2D array.
     * @return A copy of the matrix as a 2D array.
     */
    public int[][] toArray() {
        int[][] result = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            System.arraycopy(data[i], 0, result[i], 0, data[i].length);
        }
        return result;
    }

    /**
     * Returns a string representation of the matrix.
     * @return A formatted string displaying matrix values.
     */
    @Override
    public String toString() {
        String result = "";
        for (int[] row : data) {
            for (int value : row) {
                result += value + " ";
            }
            result += "\n";
        }
        return result;
    }
}
