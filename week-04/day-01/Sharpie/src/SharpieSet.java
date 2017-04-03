import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {
    sharpies = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    this.sharpies.add(sharpie);
  }



  public int counter() {
    int counter = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getInkAmount() > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void remove() {

    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getInkAmount() == 0) {
        sharpies.remove(i);
      }
    }
    System.out.println(sharpies);
  }

}
