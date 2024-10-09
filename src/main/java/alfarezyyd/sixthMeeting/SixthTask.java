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

  public static void primeNumberLooping() {
    for (int i = 0; i <= 20; i++) {
      boolean isPrimeNumberFlag = true;
      for (int j = 2; j <= 20; j++) {
        if (i % j == 0 && i != j) {
          isPrimeNumberFlag = false;
        }
      }
      if (isPrimeNumberFlag) {
        System.out.println(i);
      }
    }
  }
}
