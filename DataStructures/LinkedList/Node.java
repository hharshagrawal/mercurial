/*
* Node Class for Singly Linked Lists
*/
public class Node {
  protected int value;
  protected Node next;

  // Default Constructor 
  public Node () {
    value = 0;
    next = null;
  }

  public Node (int value) {
    this.value = value;
    this.next = null;
  }

  // Constructor : Initialize Node with val and next
  public Node (int value, Node next) {
    this.value = value;
    this.next = next;
  }

  // Function to set the Link
  public void setNext (Node next) {
    this.next = next;
  }

  // Function to set the value of the node
  public void setValue (int value) {
    this.value = value;
  }

  // Function to get Link to the next Node
  public Node getNext () {
    return next;
  }

  // Function to get the value stored in the node
  public int getValue () {
    return value;
  }
}