package nl.asd.app.sjoerd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HANLinkedListTest {

    HANLinkedList<Integer> linkedList;

    @Before
    public void setUp() {
        linkedList = new HANLinkedList<Integer>(5);
    }

    @Test
    public void addFirstTest() {
        linkedList.addFirst(10);
        assertEquals(10, linkedList.get(0).getValue());
    }

    @Test
    public void removeFirstTest() {
        linkedList.add(20);
        linkedList.removeFirst();
        assertEquals(20, linkedList.get(0).getValue());
    }

    @Test (expected = NullPointerException.class)
    public void insertIndexTooHighTest() {
        linkedList.insert(5, 56);
    }

    @Test
    public void insertTest() {
        linkedList.insert(1, 56);
        linkedList.insert(1, 100);
        assertEquals(100, linkedList.get(1).getValue());
        assertEquals(56, linkedList.get(2).getValue());
    }

    @Test
    public void deleteTest() {
        linkedList.add(11);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.delete(2);
        assertEquals(5, linkedList.get(0).getValue());
        assertEquals(11, linkedList.get(1).getValue());
        assertEquals(10, linkedList.get(2).getValue());
    }

}
