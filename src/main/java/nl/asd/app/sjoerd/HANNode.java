package nl.asd.app.sjoerd;

public class HANNode<T> {

    private HANNode<T> next;
    private T value;

    public HANNode(T value) {
        this.value = value;
    }

    public HANNode(T value, HANNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public HANNode<T> next() {
        return next;
    }

    public void setNext(HANNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
