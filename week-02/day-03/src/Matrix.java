import java.util.Arrays;

public class Matrix {
  public static void main(String[] args) {
    int[][] array1 = new int[4][4];
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array1[i].length; j++) {
        if (j == i) {
          array1[i][j] = 1;
        } else {
          array1[i][j] = 0;
        }
      }
    }
    for (int k = 0; k < 4; k++) {
      System.out.println(Arrays.toString(array1[k]));
    }
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