public class queueMain {
    public static void main(String[] args) throws Exception {
        
        circularQueue queue = new circularQueue(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();

        System.out.println(queue.delete());

        queue.display();

        queue.add(60);

        queue.display();

        
        
    }
}
