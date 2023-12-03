class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class stack_In_Min_Function {
    static class Stack {
        Node head;
        int size;
        Stack minStack; // Additional stack to track minimum elements

        Stack() {
            this.head = null;
            this.size = 0;
            this.minStack = new Stack(); // Initialize the additional stack
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void push(int element) {
            Node newHead = new Node(element);
            newHead.next = head;
            head = newHead;
            size++;

            // Update minStack
            if (minStack.isEmpty() || element <= minStack.top()) {
                minStack.push(element);
            }
        }

        public int pop() {
            if (head == null) {
                return -1;
            }
            int temp = head.data;
            head = head.next;
            size--;

            // Update minStack
            if (temp == minStack.top()) {
                minStack.pop();
            }
            return temp;
        }

        public int top() {
            if (size == 0 || head == null) {
                return -1;
            }
            return head.data;
        }

        public int min() {
            if (minStack.isEmpty()) {
                return -1;
            }
            return minStack.top();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(4);
        stack.push(5);
        while (!stack.isEmpty()) {
            System.out.println("Top: " + stack.top() + ", Min: " + stack.min());
            stack.pop();
        }
    }
}
