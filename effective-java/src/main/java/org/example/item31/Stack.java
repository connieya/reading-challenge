package org.example.item31;

public class Stack<E> {
//    public Stack();
//    public void push(E e);
//    public E pop();
//    public boolean isEmpty();

    public void pushAll(Iterable<E> src) {
        for (E e : src){
            push(e);
        }
    }

    private void push(E e) {

    }
}
