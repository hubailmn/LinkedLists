package lists;

import nodes.Node;

public class SinglyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e, head);

        head = newNode;
        if (isEmpty()) tail = head;
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e, null);

        if (isEmpty()) head = newNode;
        else tail.setNext(newNode);

        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E removedElement = head.getElement();

        head = head.getNext();
        size--;

        if (isEmpty()) tail = null;
        return removedElement;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        E removedElement = tail.getElement();

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return removedElement;
        }

        Node<E> walk = head;
        while (walk.getNext() != tail) {
            walk = walk.getNext();
        }

        walk.setNext(null);
        tail = walk;
        size--;
        return removedElement;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");

        Node<E> walk = head;
        while (walk != null) {
            sb.append(walk.getElement());
            if (walk != tail)
                sb.append(", ");
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }
}
