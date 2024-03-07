package stack;

/**
 * junit 사용법을 아직 안 가르쳐줘서 main 함수로 test
 */
public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(2);
        MyStack stack2 = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();
        stack.peek(); // 5 나와야함

        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        
        stack2.peek(); // 1 나와야함
        stack2.printStack();
    }
}
