public class CircularLL {

    Node head;
    Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {

        Node node = new Node(value);

        if ( head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {

        Node temp = head;

        if ( head == null ) {
            System.out.println("Empty");
            return;
        }

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while ( temp != head); 

        System.out.println("HEAD");
    }

    public void delete(int val) {
        

        if ( head == null) {
            System.out.println("Empty");
            return;
        }

        if ( head == tail) {//if only one node is in the list 
            head = null;
            tail = null;
            return;
        }

        Node temp = head;

        if ( temp.value == val) {//if head is the value which you want to delete
            head = head.next;
            tail.next = head;
            return;
        }

        do { //if the value you want to delete is not the head 
            Node n = temp.next;
            if ( n.value == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while ( temp != head);
    }

    public class Node { 
        int value;

        Node next;

        public Node(int value) {
            this.value = value;
        }

    }
}
