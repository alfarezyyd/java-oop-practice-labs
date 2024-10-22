package alfarezyyd.eigthMeeting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

  public void renderSimpleForm() {
    Frame newFrame = new Frame("Simple Form");
    newFrame.setSize(400, 300);

    // Membuat label dan field untuk nama
    Label nameLabel = new Label("Name: ");
    TextField nameField = new TextField(10);
    nameLabel.setBounds(50, 50, 100, 30);
    nameField.setBounds(150, 50, 200, 30);

    // Membuat label dan field untuk umur
    Label ageLabel = new Label("Age: ");
    TextField ageField = new TextField(10);
    ageLabel.setBounds(50, 100, 100, 30);
    ageField.setBounds(150, 100, 200, 30);

    // Membuat tombol
    Button newButton = new Button("Submit");
    newButton.setBounds(150, 150, 100, 30);

    // Menambahkan ActionListener untuk tombol
    newButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Mengambil input dari text field
        String name = nameField.getText();
        String age = ageField.getText();

        // Menampilkan dialog pop-up dengan informasi yang dimasukkan
        String message = "Name: " + name + "\nAge: " + age;
        Dialog dialog = new Dialog(newFrame, "Information", true);
        dialog.setSize(300, 200);
        dialog.setLayout(new BorderLayout());
        dialog.add(new Label(message), BorderLayout.CENTER);

        // Tombol CONFIRMATION untuk menutup dialog
        Button okButton = new Button("CONFIRMATION");
        okButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            dialog.dispose(); // Menutup dialog
          }
        });

        dialog.add(okButton, BorderLayout.SOUTH);
        dialog.setVisible(true); // Menampilkan dialog
      }
    });

    // Menambahkan komponen ke frame
    newFrame.add(nameLabel);
    newFrame.add(nameField);
    newFrame.add(ageLabel);
    newFrame.add(ageField);
    newFrame.add(newButton);
    newFrame.setLayout(null);
    newFrame.setVisible(true);

  }

  public void renderSimpleFormSwing() {
    // Membuat frame
    JFrame frame = new JFrame("Simple Form");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    // Membuat label dan field untuk nama
    JLabel nameLabel = new JLabel("Name: ");
    JTextField nameField = new JTextField(10);

    // Membuat label dan field untuk umur
    JLabel ageLabel = new JLabel("Age: ");
    JTextField ageField = new JTextField(10);

    // Membuat tombol
    JButton submitButton = new JButton("Submit");

    // Menambahkan ActionListener untuk tombol
    submitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Mengambil input dari text field
        String name = nameField.getText();
        String age = ageField.getText();

        // Menampilkan dialog pop-up dengan informasi yang dimasukkan
        String message = "Name: " + name + "\nAge: " + age;
        JOptionPane.showMessageDialog(frame, message, "Information", JOptionPane.INFORMATION_MESSAGE);
      }
    });

    // Menambahkan komponen ke frame
    frame.add(nameLabel);
    frame.add(nameField);
    frame.add(ageLabel);
    frame.add(ageField);
    frame.add(submitButton);

    // Menampilkan frame
    frame.setVisible(true);
  }

}
