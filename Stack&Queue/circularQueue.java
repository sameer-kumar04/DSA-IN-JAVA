public class circularQueue {//we use circular queue beacuse in customQueue removal of element takes O(n) because of shifting the elements after removal of any element from front

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;//defualt size of stack if user does not enter the size 

    protected int end = 0;//pointer used for insertion
    protected int front = 0;//pointer used for deletion
    protected int size = 0;

    public circularQueue() {
        this(DEFAULT_SIZE);
    }

    public circularQueue(int size) {
        this.data = new int[size];
    }

    public boolean add(int item) {
        if ( isFull() ) {
            return false;
        }

        data[end] = item;
        end++;
        end = end % data.length;//here this is because here first and end are rotating like in 0-5 range it will come again to 5 % 5 == 0 , in this process O(1) time takes 
        size++;

        return true;
    }

    public int delete() throws Exception {
        if ( isEmpty() ) {
            throw new Exception("Queue is Empty");
        }

        int value = data[front]; 
        front++;
        front = front % data.length;
        size--;
        
        return value;
    }
    
    public int first() throws Exception{//like peek for just checking the first element 

        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        return data[front];//here front pointing on the first element //because in queue deletion held from front
    }

    public void display() {
        if ( isEmpty() ) {
            System.out.println("Empty");
            return;
        }

        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
        } while ( i != end);
        System.out.println("END");

    }

    public boolean isFull() {
        return size == data.length;//beacuse end is rotating here after 0-5 it will come again to 0
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
