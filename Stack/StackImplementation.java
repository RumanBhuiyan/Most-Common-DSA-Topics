public class StackImplementation {

    static class Stack {

        private int MAX_SIZE = 1000;
        private int top = -1;
        public int[] keepStack = new int[MAX_SIZE];

        public boolean isEmpty() {
            return top == -1 ? true : false;
        }

        public boolean isFull() {
            return top >= MAX_SIZE ? true : false;
        }

        public int size() {
            return top + 1;
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            keepStack[++top] = data;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Can't pop .");
            }
            return keepStack[top--];
        }
    }

    public static void main(String[] args) {

        Stack myStack = new Stack();

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("Is Stack Empty ? :" + myStack.isEmpty());
        System.out.println("Is Stack Full ? :" + myStack.isFull());
        System.out.println("Stack size :  :" + myStack.size());
        int popingItem = myStack.pop();
        System.out.println("Poping Item :" + popingItem);
        System.out.println("Now Vector size  :" + myStack.size());
    }
}
