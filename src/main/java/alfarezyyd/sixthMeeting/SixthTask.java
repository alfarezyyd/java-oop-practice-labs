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
          break;
        }
      }
      if (isPrimeNumberFlag) {
        System.out.println(i);
      }
    }
  }

  public static void evenOrOddLooping() {
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " adalah bilangan genap");
      } else {
        System.out.println(i + " adalah bilangan ganjil");
      }
    }
  }
  
  public static void chickenSongLooping(int numberOfChicken){
    for (int i = numberOfChicken; i > 0; i--) {
      System.out.println("Anak ayam turunlah " + i);
      System.out.println("Pergi satu, tinggallah " + (i - 1));
    }
  }

  public static void characterLooping(){
    for (int i = 65; i <= 90; i++) {
      System.out.print((char) i + " ");
    }
  }
}
