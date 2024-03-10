package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    @Test
    public void push() {
        MyStack stack = new MyStack();
        stack.push(2);

        assertEquals(2, stack.peek());
        assertEquals(2, stack.pop());
    }
}