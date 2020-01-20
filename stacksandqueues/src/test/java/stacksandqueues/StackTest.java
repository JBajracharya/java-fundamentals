package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void pushAValue(){
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.top.value);
    }

    @Test
    public void pushMultipleValues() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        String expected = "5->4->3->2->1->NULL";
        String actual = stack.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void pop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();

        String expected = "4->3->2->1->NULL";
        String actual = stack.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void emptyStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        assertNull(stack.top);
    }

    @Test
    public void peek() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int expected = 5;
        int actual = stack.peek().value;
        assertEquals(expected, actual);
    }

    @Test
    public void isEmpty() {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        stack1.push(1);

        assertFalse(stack1.isEmpty());
        assertTrue(stack2.isEmpty());
    }

}