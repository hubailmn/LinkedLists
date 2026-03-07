package lists;

import nodes.Node;

public class CircularlyLinkedList<E> {

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
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<E>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node<E>(e, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public void addLast(E e) {
        if (isEmpty()) {
            addFirst(e);
            return;
        }

        Node<E> newNode = new Node<E>(e, tail.getNext());
        tail.setNext(newNode);
        tail = tail.getNext();

        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> firstElement = tail.getNext();
        E removedElement = firstElement.getElement();

        if (size == 1) {
            tail = null;
            size = 0;
            return removedElement;
        }

        tail.setNext(firstElement.getNext());
        size--;
        return removedElement;
    }

    public E removeLast() {
        if (isEmpty()) return null;

        Node<E> lastElement = tail;
        Node<E> firstElement = tail.getNext();
        E removedElement = tail.getElement();

        if (size == 1) {
            tail = null;
            size = 0;
            return removedElement;
        }

        Node<E> walk = tail.getNext();
        while (walk.getNext() != lastElement) {
            walk = walk.getNext();
        }

        walk.setNext(firstElement);
        tail = walk;

        size--;
        return removedElement;
    }

    public String toString() {
        if (isEmpty()) return "()";
        StringBuilder sb = new StringBuilder("(");

        Node<E> walk = tail.getNext();
        for (int i = 0; i < size; i++) {
            sb.append(walk.getElement());
            if (walk != tail) {
                sb.append(", ");
            }
            walk = walk.getNext();
        }

        sb.append(")");
        return sb.toString();
    }
}
