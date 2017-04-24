import java.util.ArrayList;
import java.util.HashMap;

public class trees {

  public static void main(String[] args) {

    treeMap("oak", "green", "4", "female");
    treeMap("pine", "dark green", "30", "male");
    treeMap("mapple", "dark green", "50", "male");
    treeMap("fig tree", "dark green", "15", "male");
    treeMap("apple tree", "light green", "13", "female");

  }

  private static ArrayList<HashMap<String, String>> treeMap(String type, String leafColor,
      String age, String sex) {
    ArrayList<HashMap<String, String>> trees = new ArrayList<>();
    HashMap<String, String> newTree = new HashMap<>();
    newTree.put("type", type);
    newTree.put("leaf color", leafColor);
    newTree.put("age", age);
    newTree.put("sex", sex);
    trees.add(newTree);
    System.out.println(trees);
    return trees;
  }
}
