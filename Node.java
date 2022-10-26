public class Node {
    private Node next ;
    private int value ;

    public Node (int value ) {
        this(value , null);
    }
    public Node (int value, Node next){
        this.value = value ;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
