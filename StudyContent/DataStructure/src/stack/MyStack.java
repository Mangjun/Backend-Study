package stack;

public class MyStack {
    private int[] stack; // 데이터를 저장할 배열
    private int size = 0; // 데이터 개수

    public MyStack() {
        stack = new int[8];
    }

    public MyStack(int size) {
        stack = new int[size];
    }

    /* 2024-03-08 Jang */
    public void push(int data) {
        /* 저장 공간이 부족할 경우 2배로 늘릴 것! */
        if (size == stack.length) {
            int newSize = stack.length * 2;
            int[] newStack = new int[newSize];
            System.arraycopy(stack,0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[size++] = data;
    }

    /* 2024-03- Lee */
    public int pop() {
        return 0;
    }

    /* 2024-03- Jeon */
    public int peek() {
        return 0;
    }

    public void printStack() {
        System.out.print("Stack: ");
        for (int temp : stack) {
            System.out.print(temp + " ");
        }
        System.out.println(" Size: " + stack.length);
    }
}
