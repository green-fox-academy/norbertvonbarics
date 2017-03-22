
public class Factorial {
  public static void main(String[] args) {
    int num1 = 5;
    System.out.println(factorio(num1));
  }
  public static int factorio(int a){
    int x = 1;
    if(a == 1){
      x = a;
    } else if(a > 1){
      for(int i = 1; i < a + 1; i++){
        x *= i;
      }
    } else {
      x = 0;
    } return x;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
