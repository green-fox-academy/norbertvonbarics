import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  public static void main(String[] args) {

    int date = 0;
    String inputFile = "";
    String outputFile = "";

    Sort sort = new Sort();
    IO io = new IO();
    //date = Integer.parseInt(args[1]);
    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();

    OptionSet options = parser.parse(args);
    if (options.has("y")) {
      date = Integer.parseInt(options.valueOf("y").toString());
    }

    if (options.has("f")) {
      inputFile = options.valueOf("f").toString();
      io.readFile(inputFile);
    }

    if (options.has("o")) {
      outputFile = options.valueOf("o").toString();
      io.writeFile(sort.toSort(io.readFile(outputFile), date), outputFile);
    }

    System.out.println("DATE: " + date);
    System.out.println("INPUT: " + inputFile);
    System.out.println("OUTPUT: " + outputFile);
  }
}
