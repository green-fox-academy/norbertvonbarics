public class VariableMutation2 {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    // if w is even increment out by one
    // hope you think of "a" as "w"...
    if(a % 2 == 0){
      out++;
    }
    System.out.println(out);




    int b = 13;
    String out2 = "";
    // if b is between 10 and 20 set out2 to "Sweet!"
    // if less than 10 set out2 to "More!",
    // if more than 20 set out2 to "Less!"
    if((10 <= b) && (b <= 20)) {
      System.out.println("Sweet!");
    } else if(b < 10){
      System.out.println("More!");
    } else System.out.println("Less!");

    System.out.println(out2);



    int c = 123;
    int credits = 100;
    boolean isBonus = false;
    // if credits are at least 50,
    // and isBonus is false decrement c by 2
    // if credits are smaller than 50,
    // and isBonus is false decrement c by 1
    // if isBonus is true c should remain the same
    if((credits >= 50) && (isBonus == false)){
      c -= 2;
      System.out.println(c);
    } else if((credits < 50) && (isBonus == false)){
      c -= 1;
      System.out.println(c);
    } else{
      System.out.println("c is the same");
    }

    System.out.println(c);




    int d = 8;
    int time = 120;
    String out3 = "";
    // if d is dividable by 4
    // and time is not more than 200
    // set out3 to "check"
    // if time is more than 200
    // set out3 to "Time out"
    // otherwise set out3 to "Run Forest Run!"


    System.out.println(out3);
  }
}