public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunny(5));
  }
  public static int bunny (int ear) {
    if (ear == 0) {
      return 0;
    } else {
      return 2 + bunny(ear -1);
    }
  }
}

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
