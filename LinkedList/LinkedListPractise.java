public class LinkedListPractise {

    static class Node {
        public int value;
        Node next;//ex: next=second so next contains Node type value

        // constructor
        Node(int val) {
            value = val;
        }
    }

    public static void main(String[] args) {
        //Creating 3 nodes in heap memory & assigning reference of them
        Node head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        // Connecting nodes
        head.next = second;
        second.next = third;

        // iterating through LinkedList items 
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
