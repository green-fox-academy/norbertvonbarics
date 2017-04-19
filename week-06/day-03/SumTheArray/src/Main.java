import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Sum sumArray = new Sum();
    Integer[] Array = {4,3,1,7,5,84,3,2};
    System.out.println(Arrays.toString(Array));
    Sum.sum(Array, 3);
    System.out.println(Sum.sum(Array,4));
  }
}