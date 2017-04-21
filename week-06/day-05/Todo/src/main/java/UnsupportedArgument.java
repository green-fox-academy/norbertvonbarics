
class UnsupportedArgument {

  private static final String LINE = "=======================================\n";
  private static final String UNSUPPORTED = "Unsupported argument!\n";

  static void unsupported(String[] args) {
    boolean argumentC = !args[0].equals("-c");
    boolean argumentA = !args[0].equals("-a");
    boolean argumentL = !args[0].equals("-l");
    boolean argumentLA = !args[0].equals("-la");
    boolean argumentR = !args[0].equals("-r");

    if (argumentC || argumentA || argumentL || argumentLA || argumentR) {
      Ascii logo = new Ascii();
      System.out.println("\n" + LINE + UNSUPPORTED + LINE);
      logo.printUsage();
    }
  }
}