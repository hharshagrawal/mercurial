public class LinkedList() {
  protected Node start;
  protected Node end;
  public int size;

  /* Constructor */
  public LinkedList() {
    start = null;
    end = null;
    size = 0;
  }

  // Function to check if the list is Empty
  public function isEmpty() {
    return start == null;
  }

  // Function to get current length of the list
  public function getLength() {
    return size;
  }

  // Add node at the start of the list
  public function addAtStart(int value) {
    Node n = new Node(value);
    size++;
    if (start == null) {
      start = n;
      end = n;
    } else {
      n.setNext(start);
      start = n;
    }
  }

  // Add node at the end of the list 
  public function addAtEnd(int value) {
    Node n = new Node(value);
    size++;
    if (start == null) {
      start = n;
      end = n;
    } else {
      end.setNext(n);
      end = n;
    }
  }

  public function printList() {
    System.out.println("Singly Linked List ->");
    if (size == 0) {
      System.out.println("Empty List");
    } else {
      Node currentNode = start;
      for (int i = 0; i < size; i++) {
        System.out.println(i + "->" + currentNode.getValue());
        currentNode = currentNode.getNext();
      }
    }
  }
}