import java.util.ArrayList;
import java.util.List;

class RandomNumber {
  static List<Integer> randomNumber() {
    List<Integer> digits = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      digits.add((int) Math.floor(Math.random() * 10));
    }
    return digits;
  }
}
