import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  public static void main(String[] args) {

    int date = 0;
    String inputFile = "";
    String outputFile = "";

    Sort sort = new Sort();
    IO io = new IO();

    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();
    OptionSet options = parser.parse(args);
    if (options.has("y")) {
      date = Integer.parseInt((String) options.valueOf("y"));
    }

    if (options.has("f")) {
      inputFile = (String) options.valueOf("f");
      io.readFile(inputFile);
    }

    if (options.has("o")) {
      outputFile = (String) options.valueOf("o");
      io.writeFile(sort.toSort(io.readFile(outputFile), date));
    }

    System.out.println("DATE: " + date);
    System.out.println("INPUT: " + inputFile);
    System.out.println("OUTPUT: " + outputFile);
  }
}
