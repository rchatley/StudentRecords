package example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StudentRecordsTest {

  @Test
  public void findsTopStudents() throws IOException {

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));

    new StudentRecords().findTopStudents();

    assertThat(
        output.toString(),
        is("""
        Tom James (223145) - 75
        Alice Smith (253633) - 76
        """));
  }
}
