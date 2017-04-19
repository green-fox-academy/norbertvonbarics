import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Sort newSort = new Sort();
    Integer[] Array = {4,3,1,7,5,84,3,2};
    System.out.println(Arrays.toString(Array));
    Sort.sortArray(Array);
    System.out.println(Arrays.toString(Sort.sortArray(Array)));
  }
}
