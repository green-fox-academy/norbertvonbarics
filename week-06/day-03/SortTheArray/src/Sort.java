import java.util.Arrays;
import java.util.Collections;

public class Sort {
  public static < T extends Number> int[] sortArray(T[] Array) {
    int[] temp = new int[Array.length];
    Arrays.sort(Array);
    int counter = 0;
      for (int i = Array.length-1; 0 < i; i--){
        temp[counter] = Array[i].intValue();
        counter++;
      }
    return temp;
  }
}
