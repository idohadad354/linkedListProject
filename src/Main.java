public class Main {
  public static void main(String[] args) {

    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    linkedList.insert(23);
    linkedList.insert(34);
    linkedList.insert(65);
    linkedList.insert(645);
    linkedList.insert(3456);

    linkedList.show();

    linkedList.reverseList();

    linkedList.show();
  }
}
