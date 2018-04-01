public class LinkedList {
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
  public boolean isEmpty() {
    return start == null;
  }

  // Function to get current length of the list
  public int getLength() {
    return size;
  }

  // Add node at the start of the list
  public void addAtStart(int value) {
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
  public void addAtEnd(int value) {
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

  public void printList() {
    System.out.println("Singly Linked List ->");
    if (size == 0) {
      System.out.println("Empty List");
    } else {
      Node currentNode = start;
      do {
        System.out.print(currentNode.getValue() + " -> ");
        currentNode = currentNode.getNext();
      } while (currentNode.getNext() != null);
    }
  }
}