
public class Node<T> {
    private Node next ;
    private T value ;

    public Node (T value ) {
        this(value , null);
    }
    public Node (T value, Node next){
        this.value = value ;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}