
import java.util.Arrays;

public class Matrix {

  public static void main(String[] args) {
    printMatrix(5);
  }

  private static int[][] printMatrix(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (j == i) ? (matrix[i][j] = 1) : (matrix[i][j] = 0);
      }
    }
    for (int k = 0; k < size; k++) {
      System.out.println(Arrays.toString(matrix[k]));
    }
    return matrix;
  }
}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output