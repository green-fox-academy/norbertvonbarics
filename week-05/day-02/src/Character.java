import javax.swing.*;
import java.awt.*;

public class Character extends JComponent {
  int healthPoint;

  public void paint(Graphics graphics) {
    super.paint(graphics);

  }

  public Character() {
    this(100);
  }

  public Character(int healthPoint) {
    this.healthPoint = healthPoint;
  }
}
