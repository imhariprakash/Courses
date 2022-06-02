class FixedStack implements IntStack {
    private int[] stack;
    private int top;

    public FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }
}