
public class Counter {
  private int value;
  private int reset;

  public Counter() {
    this(0);
  }

  public Counter(int value) {
    this.value = value;
    reset = value;
  }

  public int add(int number) {
    value += number;
    return value;
  }

  public int add() {
    return value++;
  }

  public int reset() {
    value = this.reset;
    return value;
  }

  public int get (){
    return value;
  }

  public static void main(String[] args) {
    Counter itemCounter = new Counter();
    System.out.println(itemCounter.value);
    itemCounter.add(50);
    System.out.println(itemCounter.value);

  }
}
