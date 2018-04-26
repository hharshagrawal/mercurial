public class Queue {
  protected Node head;
  protected Node tail;
  public int size;
  protected int length;

  // Constructor
  public Queue(int length) {
    head = tail = null;
    size = 0;
    this.length = length;
  }

  // Add Element to the queue
  public void enqueue(int value) {
    Node n = new Node(value);
    size++;
    // If the size is exceeding the length of the queue, remove 1 element from the queue
    if (size > length) {
      dequeue();
      size = length;
    } 

    if (head == null) {
      head = tail = n;
    } else {
      n.setNext(head);
      head = n;
    } 
  }

  // Remove element from the queue
  public void dequeue() {
  }


}