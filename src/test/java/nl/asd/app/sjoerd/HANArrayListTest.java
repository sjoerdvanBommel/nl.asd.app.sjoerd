package nl.asd.app.sjoerd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HANArrayListTest {

    HANArrayList<Integer> arrayList;

    @Before
    public void setUp() {
        arrayList = new HANArrayList<Integer>();
    }

    @Test
    public void addAndGetTest() {
        arrayList.add(4);
        assertEquals(arrayList.get(0), 4);
    }

    @Test
    public void setTest() {
        fillArray(4);
        arrayList.set(1, 3);
        assertEquals(arrayList.get(1), 3);
    }

    @Test
    public void DoubleArrayOnMax() {
        fillArray(12);
        assertEquals(arrayList.get(10), 10);

        arrayList.set(11, 100);
        assertEquals(arrayList.get(11), 100);

        arrayList.set(5, 40);
        assertEquals(arrayList.get(5), 40);
    }

    private void fillArray(int amount) {
        for (int i = 0; i < amount; i++) {
            arrayList.add(i);
        }
    }

}
