public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented bt the variables
    int hoursAsSeconds = currentHours * 3600;
    int minutesAsSeconds = currentMinutes * 60;
    int currentTime = hoursAsSeconds + minutesAsSeconds + currentSeconds;
    int oneDayInSeconds = 86400;
    System.out.println(currentTime);
    int remainingTime = oneDayInSeconds - currentTime;
    String note = " seconds remaining from the day!";
    System.out.println(remainingTime + note);
  }
}