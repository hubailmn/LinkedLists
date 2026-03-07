import lists.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Student> singly = new SinglyLinkedList<>();

        singly.addFirst(new Student("Ayman"));

        print(singly);

        singly.addFirst(new Student("Bob"));
        print(singly);

        System.out.println("Removed: " + singly.removeLast());
        print(singly);

        System.out.println("Removed: " + singly.removeLast());
        print(singly);

    }

    private static void print(SinglyLinkedList<Student> singly) {
        System.out.println(singly);
        System.out.println("Head: " + singly.first());
        System.out.println("Tail: " + singly.last());
        System.out.println();
    }
}
