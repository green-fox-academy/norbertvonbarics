public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    String versed = "";
    for(int i = reversed.length()-1; i > -1; i--){
      versed += reversed.charAt(i);
    }
    reversed = versed;
    System.out.println(reversed);
  }
}

// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.