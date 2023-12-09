public class LinkedList {

  Node head;

  public void insert(int data) {
    Node node = new Node();
    node.data = data;

    if (this.head == null) {
      head = node;
    } else {
      Node currentNode = this.head;

      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = node;
    }
  }

  public void show() {

    if (this.head == null) {
      System.out.println("null");
    } else {
      Node currentNode = this.head;

      while (currentNode.next != null) {
        System.out.print(currentNode.data);
        System.out.print("-->");
        currentNode = currentNode.next;
      }
      System.out.print(currentNode.data);
    }
    System.out.println();
  }
}
