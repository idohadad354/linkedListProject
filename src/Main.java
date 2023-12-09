public class Main {
  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();

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
