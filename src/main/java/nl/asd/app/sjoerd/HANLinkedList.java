package nl.asd.app.sjoerd;

public class HANLinkedList<T> {

    private HANNode<T> head;

    HANLinkedList(T value) {
        head = new HANNode<T>(value);
    }

    void addFirst(T value) {
        head = new HANNode<T>(value, head);
    }

    public void removeFirst() {
        if (head.next() != null) {
            head = head.next();
        }
        else {
            head = null;
        }
    }

    public void insert(int index, T value) {
        HANNode<T> temp = head;
        for (int i = 0; i < index - 1; i++) {
            try {
                temp = temp.next();
            }
            catch (NullPointerException e) {
                throw e;
            }
        }
        temp.setNext(new HANNode<T>(value, temp.next()));
    }

    public void delete(int index) {
        HANNode<T> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next();
        }
        temp.setNext(temp.next().next());
    }

    HANNode<T> get(int index) {
        HANNode<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next();
        }
        return temp;
    }

    // extra
    public int getSize() {
        HANNode<T> temp = head;
        int i = 0;
        while ((temp = temp.next()) != null) {
            i++;
        }
        return i;
    }

    public void add(T value) {
        HANNode<T> temp = head;
        while (temp.next() != null) {
            temp = temp.next();
        }
        temp.setNext(new HANNode<T>(value));
    }

}
