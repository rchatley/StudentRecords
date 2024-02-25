package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentRecords {

  public void findTopStudents() throws IOException {

    String path = "student-data.csv";

    String line;
    BufferedReader br = new BufferedReader(new FileReader(path));

    while ((line = br.readLine()) != null) {
      String[] values = line.split(",");

      String n = values[0];
      String i = values[1];
      String a = values[2];
      String b = values[3];
      String c = values[4];
      String d = values[5];
      String e = values[6];

      if ((Integer.parseInt(a.trim()) + Integer.parseInt(b.trim()) + Integer.parseInt(c.trim()) + Integer.parseInt(d.trim()) + Integer.parseInt(e.trim())) / 5 > 70) {
        System.out.printf("%s (%d)", n, Integer.parseInt(i.trim()));
        System.out.print(" - ");
        System.out.println((Integer.parseInt(a.trim()) + Integer.parseInt(b.trim()) + Integer.parseInt(c.trim()) + Integer.parseInt(d.trim()) + Integer.parseInt(e.trim())) / 5);
      }

    }
  }

  public static void main(String[] args) throws IOException {
    new StudentRecords().findTopStudents();
  }
}
