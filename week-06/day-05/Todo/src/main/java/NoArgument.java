
public class NoArgument {

  static void noArgument(String[] args) {
    if (args.length == 0) {
      Ascii logo = new Ascii();
      logo.printAscii();
      logo.printUsage();
    }
  }
}
