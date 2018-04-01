public class SinglyLinkedList {
  public static void main(String args[]) {
    LinkedList list = new LinkedList();
    list.addAtStart(10);
    list.addAtStart(9);
    list.addAtStart(8);
    list.addAtEnd(12);
    list.addAtEnd(23);
    list.addAtEnd(34);
    list.printList();
  }
}