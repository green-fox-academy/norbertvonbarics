
class UnsupportedArgument {

  private static final String LINE = "=======================================\n";
  private static final String UNSUPPORTED = "Unsupported argument!\n";

  static void unsupported(String[] args) {
    boolean argumentC = args[0].equals("-c");
    argumentC = argumentC || args[0].equals("-a");
    argumentC = argumentC || args[0].equals("-a");
    argumentC = argumentC || args[0].equals("-l");
    argumentC = argumentC || args[0].equals("-la");
    argumentC = argumentC || args[0].equals("-r");

    if (args.length == 1) {
      if (argumentC ) {
        System.out.println();
      } else {
        Ascii logo = new Ascii();
        System.out.println("\n" + LINE + UNSUPPORTED + LINE);
        logo.printUsage();
      }
    }
  }
}