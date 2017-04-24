import java.util.ArrayList;
import java.util.List;

class Carrier {

  int ammoStack;
  int healthPoints;

  List<Aircraft> aircraftList = new ArrayList<>();

  Carrier(int ammoStack, int healthpoints) {
    this.ammoStack = ammoStack;
    this.healthPoints = healthpoints;
    this.aircraftList = aircraftList;
  }

  int fill() {
    for (int i = 0; i < aircraftList.size(); i++) {
      if (aircraftList.get(i).getType().equals("f35")) {
        aircraftList.get(i).refill(ammoStack);
        this.ammoStack -= 12;
      } else {
        aircraftList.get(i).refill(ammoStack);
        this.ammoStack -= 8;
      }
    }
    return this.ammoStack;
  }

  void addAircraft(String plane) {
    if (plane.toLowerCase().equals("f35")) {
      F35 f35 = new F35();
      this.aircraftList.add(f35);
    }
    if (plane.toLowerCase().equals("f16")) {
      F16 f16 = new F16();
      this.aircraftList.add(f16);
    }
  }

  void getStatus() {
    String status =
        "count: " + aircraftList.size() + ", Ammo Storage: " + ammoStack + ", Total Damage: "
            + getMaxDamage();
    System.out.println(status);
    for (Aircraft lines : aircraftList) {
      System.out.println(lines.toString());
    }
  }

  int getMaxDamage() {
    int damage = 0;
    for (int i = 0; i < aircraftList.size(); i++) {
      damage += aircraftList.get(i).getAmmo() * aircraftList.get(i).getDamage();
    }
    return damage;
  }

  int fight(Carrier enemyCarrier) {
    enemyCarrier.healthPoints -= getMaxDamage();
    for (Aircraft planes : aircraftList) {
      planes.setAmmo(0);
    }

    return enemyCarrier.healthPoints;
  }

  int getHealthPoints() {
    return healthPoints;
  }

  int getAmmoStack() {
    return ammoStack;
  }
}