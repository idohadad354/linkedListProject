public class LinkedList {

  Node head;

  public void insert(int data) {
    Node node = new Node();
    node.setData(data);

    if (this.head == null) {
      head = node;
    } else {
      Node currentNode = this.head;

      while (currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(node);
    }
  }

  public void show() {

    if (this.head == null) {
      System.out.println("null");
    } else {
      Node currentNode = this.head;

      while (currentNode.getNext() != null) {
        System.out.print(currentNode.getData());
        System.out.print("-->");
        currentNode = currentNode.getNext();
      }
      System.out.print(currentNode.getData());
    }
    System.out.println();
  }

  public void deleteList() {
    this.head = null;
  }

  public void reverseList() {
    Node nextNode = this.head;
    Node currentNode = this.head;
    Node prevNode = null;

    if (currentNode != null) {
      while (currentNode.getNext() != null) {
        nextNode = currentNode.getNext();
        currentNode.setNext(prevNode);
        prevNode = currentNode;
        currentNode = nextNode;
      }
      currentNode.setNext(prevNode);
      this.head = currentNode;
    }
    }
}
