import java.util.ArrayList;

public class Garden {
  public Garden() {
    ArrayList<Plant> plants = new ArrayList<>();
    Plant myFlower1 = new Flower(0.0, 0.75, "yellow", 5);
    Plant myFlower2 = new Flower(0.0, 0.75, "blue", 5);
    Plant myTree1 = new Tree(0.0, 0.4, "orange", 10);
    Plant myTree2 = new Tree(0.0, 0.4, "purple", 10);

    plants.add(myFlower1);
    plants.add(myFlower2);
    plants.add(myTree1);
    plants.add(myTree2);

    System.out.println(plants.toString());
    System.out.println(myFlower1.getWaterLevel());


  }
}
