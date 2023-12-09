public class LinkedList<T> {

  Node<T> head;

  public void insert(T data) {
    Node<T> node = new Node<T>();
    node.setData(data);

    if (this.head == null) {
      head = node;
    } else {
      Node<T> currentNode = this.head;

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
      Node<T> currentNode = this.head;

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
    Node<T> nextNode = this.head;
    Node<T> currentNode = this.head;
    Node<T> prevNode = null;

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
