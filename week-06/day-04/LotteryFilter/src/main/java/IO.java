import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class IO {

  private List<String[]> lines = new ArrayList<String[]>();

  List<String[]> readFile(String input) {
    try {
      CSVReader reader = new CSVReader(new FileReader(input), ';');
      lines = reader.readAll();
    } catch (IOException ex) {
      System.out.println("SYNTAX ERROR READ");
      System.out.println(input);
      ex.printStackTrace();
    } catch (Exception ex) {
      System.out.println("SYNTAX ERROR IMPORT");
      ex.printStackTrace();
    }
    return lines;
  }

  void writeFile(List<String[]> sortedLines, String outputFile) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(outputFile), ';',
          CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(sortedLines);
      writer.close();
    } catch (FileNotFoundException ex) {
      System.out.println("SYNTAX ERROR WRITE");
    } catch (Exception ex) {
      System.out.println("SYNTAX ERROR EXPORT");
    }
  }
}
