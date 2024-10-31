public class customStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;//defualt size of stack if user does not enter the size 

    int ptr = -1;

    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if ( isFull() ) {
           System.out.println("Stack is Full"); 
           return false;
        }

        ptr++;

        data[ptr] = item;

        return true;
    }

    public int pop() throws customException {
        if ( isEmpty() ) {
            throw new customException("Cannot pop from Empty Stack");
        }

        int value = data[ptr];
        ptr--;

        return value;
    }

    public int peek() throws customException{
        if ( isEmpty() ) {
            throw new customException("Cannot peek in Empty Stack");
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}