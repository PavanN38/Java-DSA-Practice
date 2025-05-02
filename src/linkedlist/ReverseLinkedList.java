package linkedlist;




public class ReverseLinkedList {
    Node head;

    // Method to add nodes to the linked list
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
           
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev; // Update head to new first element
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();
        System.out.println("Reversed Linked List:");
        list.printList();
    }
}