package Stack;

import java.util.ArrayList;

public class StackImplementation {
    private ArrayList<Integer> items;

    public StackImplementation() {
        items = new ArrayList<>();
    }

    public void push(int item) {
        items.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }
}
