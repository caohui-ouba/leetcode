package lc381;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Knox
 * @Date: 2019-04-14 14:59
 * @Description: You Know
 * @Version 1.0
 */
class RandomizedCollection {
    private Map<Integer, Integer> map = new HashMap<>();
    private int size = 0;
    private List<Integer> list = new ArrayList<>();

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection() {

    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
        size++;
        return true;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        map.put(val, map.get(val) - 1);
        size--;
        return true;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return 0;
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
public class LC381 {
}
