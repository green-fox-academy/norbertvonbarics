
public class ten {
  public static void main(String[] args) {
    double a = 30;
    double b = 40;
    double c = 20;
    String volume = "Volume: ";
    String surface = "Surface: ";
    System.out.println(volume + a * b * c);
    System.out.println(surface + 2 * (a * b + b * c + a * c));
  }
}

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000