import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tile extends GameObject {
  private boolean wall;


  public Tile(int posX, int posY, boolean wall) {
    super(posX, posY);
    this.wall = wall;
    if (wall) {
      super.costume = "./assets/wall.png";
    } else {
      super.costume = "./assets/floor.png";
    }
  }
}

