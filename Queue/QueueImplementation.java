public class QueueImplementation {

    static class Queue {

        private int MAX_SIZE = 1000;
        private int[] queue = new int[MAX_SIZE];
        private int back = -1;

        public boolean isEmpty() {
            return (back == -1) ? true : false;
        }

        public boolean isFull() {
            return (back + 1 == MAX_SIZE) ? true : false;
        }

        public int size() {
            return back + 1;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full ");
            }
            queue[++back] = data;
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }
            for (int i = 0; i < back; i++) {
                queue[i] = queue[i + 1];
            }
        }

        public int peek() {
            return queue[0];
        }
    }

    public static void main(String[] args) {

        Queue myqueue = new Queue();

        myqueue.enqueue(1);
        myqueue.enqueue(2);
        myqueue.enqueue(3);
        myqueue.enqueue(4);

        System.out.println("Is Queue Empty ? " + myqueue.isEmpty());
        System.out.println("Is Queue Full ? " + myqueue.isFull());
        System.out.println("Queue Size :  " + myqueue.size());
        System.out.println("Front Element :  " + myqueue.peek());
        myqueue.dequeue();
        System.out.println("Now Front Element " + myqueue.peek());

    }
}