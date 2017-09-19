package nl.asd.app.sjoerd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HANStackTest {

    HANStack<Integer> hanStack;

    @Before
    public void setUp() {
        hanStack = new HANStack<Integer>(5);
    }

    @Test
    public void pushPopAndTopTest() {
        hanStack.push(5);
        hanStack.push(10);
        hanStack.push(15);
        hanStack.pop();
        assertEquals(10, hanStack.top());
        hanStack.pop();
        assertEquals(5, hanStack.top());
    }

    @Test
    public void getSizeTest() {
        hanStack.push(15);
        assertEquals(1, hanStack.getSize());
        hanStack.push(1);
        assertEquals(2, hanStack.getSize());
    }

}
