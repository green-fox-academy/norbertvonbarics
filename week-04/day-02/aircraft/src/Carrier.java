import java.util.ArrayList;
import java.util.List;

public class Carrier {

  int ammoStack;
  int healthPoints;

  List<Aircraft> aircraftList = new ArrayList<>();

  Carrier(int ammoStack, int healthpoints) {
    this.ammoStack = ammoStack;
    this.healthPoints = healthpoints;
    this.aircraftList = aircraftList;
  }

  int fill(Aircraft plane) {
    if (plane.getType().equals("f35")) {
      plane.refill(12);
      return this.ammoStack - 12;
    } else {
      plane.refill(8);
      return ammoStack - 8;
    }
  }

  void addAircraft(String plane) {
    if(plane.toLowerCase().equals("f35")){
      F35 f35 = new F35();
      this.aircraftList.add(f35);
    }
    if(plane.toLowerCase().equals("f16")) {
      F16 f16 = new F16();
      this.aircraftList.add(f16);
    }
  }

  public List<Aircraft> getAircraftList() {
    return aircraftList;
  }
}