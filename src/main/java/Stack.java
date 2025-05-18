import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.LinkedList;

public class Stack {
    private Deque<Integer> elements;

    public Stack() {
        this.elements = new LinkedList<>();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void push(int element) {
        elements.addFirst(element);
    }

    public int peek() {
        return elements.getFirst();
    }

    public int pop() {
        return elements.removeFirst();
    }
}