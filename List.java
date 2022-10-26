public class List {
    private Node head;


    public List() {
        this.head = null;

    }

    public List(int value) {
        this.head = new Node(value);
    }

    public Node getHead() {
        return this.head;
    }

    public void addInFront(int value) {
        Node newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void traverse() {
        Node p = this.head;

        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

    public void addAtEnd(int value) {

        if (this.head != null ){
        Node lastNode = this.head;
        while (lastNode.getNext() != null){
            lastNode = lastNode.getNext();
        }
        lastNode.setNext( new Node (value ));
    }else {
            addInFront(value);
        }
    }

    public void insertAfter(int value, int after) {
        Node pointer = this.head;

        while (pointer.getValue() != after) {
            pointer = pointer.getNext();
        }
        Node afterNode = new Node(value, pointer.getNext());
        pointer.setNext(afterNode);

    }

    public void insertBefore(int value , int before){
        Node pointer = this.head ;
        while( pointer.getNext() != null) {
            if (pointer.getNext().getValue() == before){
                Node newNode = new Node (value ,pointer.getNext());
                pointer.setNext(newNode);

                break;

            }else if (this.head.getValue() == before){
                addInFront(value);
            }
            pointer = pointer.getNext();
        }
    }

    public void deleteHead (){
        this.head = this.head.getNext();

    }

    public void deleteLast(){
        if (this.head.getNext() == null){
            this.head = null;

        }else{
        Node pointer = this.head ;
        while (pointer.getNext().getNext()!=null){
            pointer =pointer.getNext();
        }
        pointer.setNext(null);


        }
    }

    public void delete (int value ){
        Node pointer = this.head ;
        if (value == this.head.getValue()){
            deleteHead();
        }else {
        while (pointer.getNext().getValue() != value ){
            pointer =pointer.getNext();
        }
        pointer.setNext(pointer.getNext().getNext());

        }
    }

    public boolean find (int value ){
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
