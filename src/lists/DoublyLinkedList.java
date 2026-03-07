package lists;

import nodes.DoublyNode;

public class DoublyLinkedList<E> {

    private final DoublyNode<E> header;
    private final DoublyNode<E> trailer;
    private int size;

    public DoublyLinkedList() {
        header = new DoublyNode<>(null, null, null);
        trailer = new DoublyNode<>(null, header, null);
        header.setNext(trailer);
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrevious().getElement();
    }

    public void addFirst(E e) {
        DoublyNode<E> newNode = new DoublyNode<>(e, header, header.getNext());
        header.setNext(newNode);

        newNode.getNext().setPrevious(newNode);
        size++;
    }

    public void addLast(E e) {
        DoublyNode<E> newNode = new DoublyNode<>(e, trailer.getPrevious(), trailer);
        trailer.setPrevious(newNode);

        newNode.getPrevious().setNext(newNode);
        size++;
    }


    public E removeFirst() {
        if (isEmpty()) return null;
        DoublyNode<E> removedNode = header.getNext();
        E removedElement = removedNode.getElement();

        header.setNext(removedNode.getNext());
        removedNode.getNext().setPrevious(header);

        size--;
        return removedElement;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        DoublyNode<E> removedNode = trailer.getPrevious();
        E removedElement = removedNode.getElement();

        trailer.setPrevious(removedNode.getPrevious());
        removedNode.getPrevious().setNext(trailer);

        size--;
        return removedElement;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        DoublyNode<E> walk = header.getNext();

        while (walk != trailer) {
            sb.append(walk.getElement());
            if (walk.getNext() != trailer) {
                sb.append(", ");
            }
            walk = walk.getNext();
        }

        sb.append(")");
        return sb.toString();
    }
}
