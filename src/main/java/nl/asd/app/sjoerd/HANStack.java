package nl.asd.app.sjoerd;

public class HANStack<T> {

    HANLinkedList<T> hanLinkedList;

    public HANStack(T value) {
        this.hanLinkedList = new HANLinkedList<T>(value);
    }

    T pop() {
        if (getSize() > 0) {
            T returnValue = hanLinkedList.get(0).getValue();
            hanLinkedList.removeFirst();
            return returnValue;
        }
        return null;
    }

    T top() {
        return hanLinkedList.get(0).getValue();
    }

    void push(T value) {
        hanLinkedList.addFirst(value);
    }

    int getSize() {
        return hanLinkedList.getSize();
    }

}
