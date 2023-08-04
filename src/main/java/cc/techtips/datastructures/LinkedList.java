package cc.techtips.datastructures;

/**
 * @author James
 */
public class LinkedList {

    static class Node<E> {
        public E e;
        public Node<E> next;

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }
    }
}
