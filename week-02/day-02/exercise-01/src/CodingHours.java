public class CodingHours {
  public static void main(String[] args) {
    int attendee = 6;
    int workhour = 52;
    int semester = 17;
    int final2 = attendee * 5;
    String coding = " hour spent with coding!";
    String workhoursTogether = " workhours in 17 weeks!";
    String percent = "% of the workhours passed with coding!";
    System.out.println(final2 * semester + coding);
    System.out.println(semester * workhour + workhoursTogether);
    System.out.println((510. / 884) * 100 + percent);
  }
}

// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52