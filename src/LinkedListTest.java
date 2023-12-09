import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LinkedListTest {
  private LinkedList<Integer> linkedList;

  @Before
  public void setUp() {
    linkedList = new LinkedList<Integer>();

    linkedList.insert(23);
    linkedList.insert(34);
    linkedList.insert(65);
    linkedList.insert(645);
    linkedList.insert(3456);
  }

  @Test
  public void insert() {

  }

  @Test
  public void show_regularExpression() {
    final String EXPECTED = "23-->34-->65-->645-->3456";
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    linkedList.show();
    assertEquals(EXPECTED, outContent.toString());
  }

  @Test
  public void deleteList() {}

  @Test
  public void reverseList() {}
}
