package alfarezyyd.sixthMeeting;

public class SixthTask {
  public static void multiplicationTable(int max) {
    System.out.printf("%4s", "");
    for (int col = 1; col <= max; col++) {
      System.out.printf("%4d", col);
    }
    System.out.println();

    for (int row = 1; row <= max; row++) {
      System.out.printf("%4d", row);
      for (int col = 1; col <= max; col++) {
        System.out.printf("%4d", row * col);
      }
      System.out.println();
    }
  }
}
