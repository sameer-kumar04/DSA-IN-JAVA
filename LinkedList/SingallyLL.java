public class SingallyLL {

    Node head;
    Node tail;

    @SuppressWarnings("unused")
    private int size;

    public SingallyLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++; // Increment size
    }

    public void insertLast(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node; // Directly assigning node to tail //you can also do tail = tail.next
        }

        size++; // Increment size
    }

    public void insert(int index, int value) {// for inserting on a particular index

        if (index < 0) {
            System.out.println("Index should grater than 0");
            return;
        }

        if (index == 0) {// same as inserting at first
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            return;

        } else {
            Node prevNode = getNode(index - 1);

            Node node = new Node(value);

            node.next = prevNode.next;
            prevNode.next = node;
        }

        size++;
    }

    public void deleteFirst() {
        if (head == null) { // List is already empty
            return;
        }

        head = head.next;

        if (head == null) { // List became empty
            tail = null;
        }

        size--;
    }

    public void deleteLast() {
        if (head == null) { // List is already empty
            return;
        }

        if (head.next == null) { // Only one node in the list
            head = null;
            tail = null;
        } else {
            Node secLastNode = getNode(size - 2);
            secLastNode.next = null;
            tail = secLastNode;
        }

        size--;
    }

    public void delete(int index) {//for deleting from the particular index 
        if (head == null || index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    
        if (index == 0) {
            deleteFirst();
            return;
        }
    
        if (index == size - 1) {
            deleteLast();
            return;
        }
    
        Node prevNode = getNode(index - 1);//for deleting any node we have to a refrence node on the just previous node of the target

        if (prevNode == null || prevNode.next == null) {
            throw new IllegalStateException("Unexpected null node at index: " + index);
        }
    
        prevNode.next = prevNode.next.next;
        size--;
    }

    public Node getNode(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void displayNode() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, SingallyLL.Node next) {
            this.value = value;
            this.next = next;
        }
    }
}