package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {

    class TimeMap {
    class Node {
        int timestamp;
        String value;

        Node(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private Map<String, List<Node>> map;

    public TimeMap() {
        map = new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
                .add(new Node(timestamp, value));

    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";

        List<Node> list = map.get(key);
        int lo = 0, hi = list.size() - 1;
        String ans = "";

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (list.get(mid).timestamp <= timestamp) {
                ans = list.get(mid).value;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;

    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
    
}
