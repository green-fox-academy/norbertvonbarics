class Sum {
  static <T extends Number> int sum(T[] Array, int length) {
    int counter = 0;
    try {
      for (int i = 0; i < length; i++) {
        counter += Array[i].intValue();
      }
    } catch (IndexOutOfBoundsException ex) {
      ex.printStackTrace();
      System.out.println("SYNTAX ERROR 1");
    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println("SYNTAX ERROR 2");
    }
    return counter;
  }
}