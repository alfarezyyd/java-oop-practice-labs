package alfarezyyd.seventhMeeting;

public class Practice {
  public void demonstrationCode() {
    //    int[] nilaiKelas3A = new int[5];
//    nilaiKelas3A[0] = 100;
//    nilaiKelas3A[1] = 95;
//    nilaiKelas3A[2] = 80;
//    nilaiKelas3A[3] = 75;
//    nilaiKelas3A[4] = 70;
    // for
//    for (int i = 0; i < 5; i++) {
//      System.out.println(nilaiKelas3A[i]);
//    }
    // do while
    // while

    // Satu Dimensi
//    int[] nilaiKelas3A = {1, 2, 3, 4, 5};
//    System.out.println(nilaiKelas3A[0]);

    // Dua Dimensi
//    int[][] nilaiKelas3A = new int[3][3];
//    nilaiKelas3A[0][0] = 100;
//    nilaiKelas3A[0][1] = 100;
//    System.out.println(nilaiKelas3A[0][0]);

    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int total = 0;
    for (int i = 0; i < array.length; i++) {
      // unary operator
      total += array[i];
      // total = total + array[i]
    }
    System.out.println(total / array.length);
  }
}
