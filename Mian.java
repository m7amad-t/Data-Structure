public class Main {
    public static void main(String[] args) {

        List l1 = new List (1);

        l1.addInFront(0);
        l1.traverse();

        System.out.println("==============");

        l1.insertAfter(3,1);
        l1.traverse();

        System.out.println("==============");

        l1.insertBefore(2 ,3);
        l1.traverse();

        System.out.println("==============");

        l1.deleteHead();
        l1.traverse();

        System.out.println("==============");

        l1.addAtEnd(4);
        l1.traverse();

        System.out.println("==============");

        l1.deleteLast();
        l1.traverse();

        System.out.println("==============");


        l1.delete(3);
        l1.traverse();

        System.out.println("==============");


        System.out.println(l1.find(2));
        System.out.println(l1.find(3));





    }
}