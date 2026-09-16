package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

    Queue<Integer> q = new LinkedList<>();

    public ImplementStackusingQueues() {
    }

    public void push(int x) {
        q.offer(x);
    }

    public int pop() {
        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }

        return q.poll();
    }

    public int top() {
        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }

        int result = q.peek();

        // Put it back
        q.offer(q.poll());

        return result;
    }

    public boolean empty() {
        return q.isEmpty();
    }

}
