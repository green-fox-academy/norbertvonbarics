public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    String finalString = "My Todo:\n".concat(todoText).concat(" - Download games\n - Diablo");
    todoText = finalString;
    System.out.println(todoText);
  }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//  - Diablo
