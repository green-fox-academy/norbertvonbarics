import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {
  public static void main(String[] args) {
    IO io = new IO();
    io.readFile();
    io.writeFile(sort(io.readFile(), 2014));

    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("a")) {
      System.out.println("`-a` was given with the argument " + options.valueOf("a"));
    }

    if (options.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }
  }

  static List<String[]> sort (List<String[]> lines, int date) {
    List<String[]> sortedList = new ArrayList<String[]>();
    for (String[] line : lines) {
      if (line[0].equals(Integer.toString(date))) {
        sortedList.add(line);
      }
    }
    return sortedList;
  }
}
