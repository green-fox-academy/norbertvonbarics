
class UnsupportedArgument {

  private static final String LINE = "=======================================\n";
  private static final String UNSUPPORTED = "Unsupported argument!\n";

  static void unsupported(String[] args) {
    if (!args[0].equals("-c") || !args[0].equals("-a") || !args[0].equals("-l") || !args[0]
        .equals("-la") || !args[0].equals("-r")) {
      Ascii logo = new Ascii();
      System.out.println("\n" + LINE + UNSUPPORTED + LINE);
      logo.printUsage();
    }
  }
}
