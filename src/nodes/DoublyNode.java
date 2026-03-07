package nodes;

public class DoublyNode<E> {

    private final E element;
    private DoublyNode<E> next;
    private DoublyNode<E> previous;

    public DoublyNode(E element, DoublyNode<E> previous, DoublyNode<E> next) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

    public E getElement() {
        return element;
    }

    public DoublyNode<E> getNext() {
        return next;
    }

    public void setNext(DoublyNode<E> next) {
        this.next = next;
    }

    public DoublyNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode<E> previous) {
        this.previous = previous;
    }
}

