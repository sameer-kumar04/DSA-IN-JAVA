public class DoubllyLL {

    Node head;
    Node tail;

    public void insertFirst(int value) {

        Node node = new Node(value);

        node.prev = null;
        node.next = head;
        if ( head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value) {//without using tail

        Node node = new Node(value);
        Node temp = head;

        if ( head == null ) {//if list is empty 
            node.prev = null;
            head = node;
            return;
        }

        while ( temp.next != null ) {//temp node will reach at the last of the list 
            temp = temp.next;
        }

        node.next = null;
        temp.next = node;
        node.prev = temp;

    }

    public void insert(int after , int value) {//insert any value after a particular value
        
        Node temp = head;

        while ( temp.value != after ) {//searching for that number if number found a refrence return to it
            temp = temp.next;
        }

        Node node = new Node(value);

        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        
        if ( node.next != null) {
            node.next.prev = node;
        }

    }

    public void deletefirst() {
        if ( head == null) {
            System.out.println("Empty List");
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void deletelast() {
        if ( head == null) {
            System.out.println("Empty");
            return;
        }

        if ( head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while ( temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    public void delete(int index) {

        if ( index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        if ( index == 0) {
            deletefirst();
            return;
        }

        Node temp = getNode(index);

        if( temp.next != null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        } else {
            deletelast();
        }

    }

    public Node getNode(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void display() {

        Node temp = head;

        while ( temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
}
