

public class List <T>{
    private Node head;
    private Node last;
    int size = 0;

    public List() {
        this.head = null;
        this.last = null;
    }

    public List(T value) {
        this.head = new Node(value);
        this.last = this.head;
        size++;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getLast() {
        return this.last;
    }

    public void addInFront(T value) {
        Node newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;
        size++;
    }

    public void traverse() {
        Node p = this.head;

        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

    public void addAtEnd(T value) {

        Node lastNode = new Node(value);

        this.last.setNext(lastNode);
        this.last = lastNode;
        size++;
    }

    public void insertAfter(T value, T after) {
        Node pointer = this.head;

        while (pointer.getValue() != after) {
            pointer = pointer.getNext();
        }
        Node afterNode = new Node(value, pointer.getNext());
        pointer.setNext(afterNode);
        size++;
    }

    public void insertBefore(T value , T before){
        Node pointer = this.head ;
        while( pointer.getNext() != null) {
            if (pointer.getNext().getValue()==before){
                Node newNode = new Node (value ,pointer.getNext());
                pointer.setNext(newNode);
                size++;
                break;

            }else if (this.head.getValue() == before){
                addInFront(value);
            }
            pointer = pointer.getNext();
        }
    }

    public void deleteHead (){
        this.head = this.head.getNext();
        size--;
    }

    public void deleteLast(){
        if (this.head == this.last){
            this.head = null;
            size =0;
        }else{
        Node pointer = this.head ;
        while (pointer.getNext().getNext()!=null){
            pointer =pointer.getNext();
        }
        pointer.setNext(null);
        this.last  = pointer;
        size--;
        }
    }

    public void delete (T value ){
        Node pointer = this.head ;
        if (value == this.head.getValue()){
            deleteHead();
        }else {
        while (pointer.getNext().getValue() != value ){
            pointer =pointer.getNext();
        }
        pointer.setNext(pointer.getNext().getNext());
        size --;
        }
    }

    public boolean find (T value ){
        Node pointer = this.head ;
        boolean find = false;
        while (pointer.getNext() != null ){
            if (pointer.getValue() == value ){
                find = true;
            }
            pointer = pointer.getNext();
        }
        return find;
    }

    public boolean isEmpty (){
        if (this.head == null ){
            return true ;
        }else {
            return false;
        }

    }
}
