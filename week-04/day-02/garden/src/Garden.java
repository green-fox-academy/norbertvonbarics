import java.util.ArrayList;

public class Garden {
  public static void main(String[] args) {
    ArrayList<Plant> plants = new ArrayList<>();
    Plant myFlower1 = new Flower(0.0, "yellow", 5.0);
    Plant myFlower2 = new Flower(5.0, "blue", 5.0);
    Plant myTree1 = new Tree(0.0, "orange", 10);
    Plant myTree2 = new Tree(0.0, "purple", 10);

    plants.add(myFlower1);
    plants.add(myFlower2);
    plants.add(myTree1);
    plants.add(myTree2);

    for (int i =0; i < plants.size();i++) {
      String type;
      if (plants.get(i).getMinWaterLevel() == 5.0) {
        type = "Flower";
      } else {
        type = "Tree";
      }
      if (plants.get(i).getWaterLevel() < plants.get(i).getMinWaterLevel()){
        System.out.println("The " + plants.get(i).getColor()+ " " + type + " needs water!");
      } else {
        System.out.println("The " + plants.get(i).getColor()+ " " + type + " doesn\'t need water!");
      }
    }
    System.out.println();
    System.out.println("Watering with 40");
    for (int i = 0; i < plants.size(); i++) {
      plants.get(i).addWater(40.0 / plants.size());
    }

    for (int j =0; j < plants.size();j++) {
      String type;
      if (plants.get(j).getMinWaterLevel() == 5.0) {
        type = "Flower";
      } else {
        type = "Tree";
      }
      if (plants.get(j).getWaterLevel() < plants.get(j).getMinWaterLevel()){
        System.out.println("The " + plants.get(j).getColor()+ " " + type + " needs water!");
      } else {
        System.out.println("The " + plants.get(j).getColor()+ " " + type + " doesn\'t need water!");
      }
    }
    System.out.println();
    System.out.println("Watering with 70!");
    for (int i = 0; i < plants.size(); i++) {
      plants.get(i).addWater(70.0 / plants.size());
    }

    for (int k =0; k < plants.size();k++) {
      String type;
      if (plants.get(k).getMinWaterLevel() == 5.0) {
        type = "Flower";
      } else {
        type = "Tree";
      }
      if (plants.get(k).getWaterLevel() < plants.get(k).getMinWaterLevel()){
        System.out.println("The " + plants.get(k).getColor()+ " " + type + " needs water!");
      } else {
        System.out.println("The " + plants.get(k).getColor()+ " " + type + " doesn\'t need water!");
      }
    }
  }
}
