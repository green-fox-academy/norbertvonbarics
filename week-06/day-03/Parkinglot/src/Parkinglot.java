import java.awt.Color;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parkinglot {

  List<Car> parkinglot = new ArrayList<>();

  void fillParkinglot() {
    for (int i = 0; i < 256; i++) {
      Car car = new Car();
      parkinglot.add(car);
    }
  }

  Map<Types, Integer> SameVehicles(List<Car> parkinglot) {
    Map<Types, Integer> typeMap = new HashMap<>();
    for (Car car : parkinglot) {
      if (typeMap.containsKey(car.getType())) {
        typeMap.put(car.getType(), typeMap.get(car.getType()) + 1);
      } else {
        typeMap.put(car.getType(), 1);
      }
    }
    return typeMap;
  }

  Map<Colors, Integer> SameColors(List<Car> parkinglot) {
    Map<Colors, Integer> colorMap = new HashMap<>();
    for (Car car : parkinglot) {
      if (colorMap.containsKey(car.getColor())) {
        colorMap.put(car.getColor(), colorMap.get(car.getColor()) + 1);
      } else {
        colorMap.put(car.getColor(), 1);
      }
    }
    return colorMap;
  }

  Map<String, Integer> vehicleOccurence(List<Car> parkinglot) {
    Map<String, Integer> carMap = new HashMap<>();
    for (Car car : parkinglot) {
      if (carMap.containsKey(car.toString())) {
        carMap.put(car.toString(), carMap.get(car.toString()) + 1);
      } else {
        carMap.put(car.toString(), 1);
      }
    }
    return carMap;
  }

  void mostOccuringVehicle(Map<String, Integer> carMap) {
    Map.Entry<String, Integer> maxEntry = null;
    for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }
    System.out.println(maxEntry);
  }
}
