package Queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpentheLock {

    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();

        if (dead.contains("0000"))
            return -1;

        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        visited.add("0000");

        int moves = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String curr = q.poll();

                if (curr.equals(target))
                    return moves;

                for (int j = 0; j < 4; j++) {
                    char[] arr = curr.toCharArray();

                    arr[j] = arr[j] == '9' ? '0' : (char) (arr[j] + 1);
                    String next = new String(arr);

                    if (!dead.contains(next) && visited.add(next)) {
                        q.offer(next);
                    }

                    arr[j] = curr.charAt(j);

                    arr[j] = arr[j] == '0' ? '9' : (char) (arr[j] - 1);
                    next = new String(arr);

                    if (!dead.contains(next) && visited.add(next)) {
                        q.offer(next);
                    }
                }
            }

            moves++;
        }

        return -1;
    }

}
