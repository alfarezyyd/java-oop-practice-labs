package alfarezyyd.eigthMeeting;

import java.awt.*;
import java.util.Scanner;

public class Practice {
  Scanner newScanner = new Scanner(System.in);

  public void demoCommandLineInterface() {
    int[] arrayOfScore = new int[10];
    for (int i = 0; i < arrayOfScore.length; i++) {
      System.out.printf("Masukkan Angka Ke - %d : ", i + 1);
      // Validasi input menggunakan while loop
      while (!newScanner.hasNextInt()) {
        System.out.println("Input tidak valid! Masukkan angka yang benar");
        System.out.printf("Masukkan Angka Ke - %d : ", i + 1);
        newScanner.next(); // Membuang input yang tidak valid
      }


      // Jika input valid, masukkan ke dalam array
      arrayOfScore[i] = newScanner.nextInt();
    }

    for (int i = 0; i < arrayOfScore.length; i++) {
      System.out.println(arrayOfScore[i]);
    }
  }


  public void renderButton() {
    Frame newFrame = new Frame("Button Example");
    Button newButton = new Button("Button");
    newButton.setBounds(50, 100, 100, 30);
    newFrame.add(newButton);
    newFrame.setSize(400, 400);
    newFrame.setLayout(null);
    newFrame.setVisible(true);
  }
}
