package nl.asd.app.sjoerd;

public class HANArrayList<T> {

    int maxSize = 10;
    int arrayIndex = 0;

    T[] array = (T[]) new Object[maxSize];

    T get(int index) {
        return array[index];
    }

    T set(int index, T element) {
        checkArraySize();
        for (int i = arrayIndex; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = element;
        arrayIndex++;
        return element;
    }

    boolean add(T t) {
        checkArraySize();
        array[arrayIndex++] = t;
        return true;
    }

    private void checkArraySize() {
        if (arrayIndex >= maxSize - 1) {
            maxSize *= 2;
            T[] tempArray = array;
            array = (T[]) new Object[maxSize + 1];
            System.arraycopy(tempArray, 0, array, 0, tempArray.length);
        }
    }

}