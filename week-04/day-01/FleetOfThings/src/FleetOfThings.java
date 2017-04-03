public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing item1 = new Thing("Get milk");
    Thing item2 = new Thing("Remove the obstacles");
    Thing item3 = new Thing("Stand up");
    item3.complete();
    Thing item4 = new Thing("Eat lunch");
    item4.complete();
    fleet.add(item1);
    fleet.add(item2);
    fleet.add(item3);
    fleet.add(item4);
    System.out.println(fleet);
  }
}