public class customQueue {
    
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;//defualt size of stack if user does not enter the size 

    int end = 0;

    public customQueue() {
        this(DEFAULT_SIZE);
    }

    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean enQueue(int item) {
        if ( isFull() ) {
            return false;
        }

        data[end] = item;//first element will store on 0th index 
        end++;

        return true;
    }

    public int deQueue() throws Exception{
        if ( isEmpty() ) {
            throw new Exception("Queue is Empty");
        }

        int value = data[0]; //in queue removal is from starting 

        //and remaining elements will shifted left

        for (int i = 1; i < data.length; i++) {//index will start from 1 because 0-index is deleted 
            data[i-1] = data[i];
        }

        end--; //if all elements will shift left end also will shifted left

        return value;
    }

    public int peek() throws Exception{//like peek for just checking the first element 

        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println("END");
    }


    public boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty() {
        return end == 0;
    }
}
