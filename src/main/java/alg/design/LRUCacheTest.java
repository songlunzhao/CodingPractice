package alg.design;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class LRUCacheTest {


    class LRUCache {
        class Entry {
            int value;
            int key;
            Entry left;
            Entry right;

            Entry(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        Entry start, end; // start, end of duble linked list
        int capacity, len;
        Map<Integer, Entry> cacheMap = new HashMap<>();

        LRUCache(int capacity) {
            this.capacity = capacity;
        }


        public void put(int key, int value) {
            if (cacheMap.containsKey(key)) {
                cacheMap.get(key).value=value;
                removeEntry(cacheMap.get(key));
                addToTop(cacheMap.get(key));
            } else {
                Entry entry = new Entry(key, value);
                addToTop(entry);
                if (capacity == len) {
                    cacheMap.remove(end.key);
                    removeEntry(end);
                } else {
                    len++;
                }
                cacheMap.put(key, entry);
            }
        }

        public int get(int key) {
            if (cacheMap.containsKey(key)) {
                removeEntry(cacheMap.get(key));
                addToTop(cacheMap.get(key));
                return cacheMap.get(key).value;
            } else {
                return -1;
            }
        }

        public void addToTop(Entry entry) {
            if (start == null) {
                start = entry;
                end = entry;
            } else {
                if (entry.left != null) {
                    entry.left.right = entry.right;
                }
                if (entry.right != null) {
                    entry.right.left = entry.left;
                }
                start.left = entry;
                entry.right = start;
                entry.left = null;
                start = entry;
            }
        }

        public void removeEntry(Entry entry) {
            if (entry.left != null) {
                entry.left.right = entry.right;
            } else {
                start=entry.right;
            }
            if (entry.right != null) {
                entry.right.left = entry.left;
            } else {
                end = entry.left;
            }
        }
    }

    @Test
    public  void testLRU() {
        LRUCache cache = new LRUCache(2 /* capacity */);

        cache.put(2,1);
        cache.put(2,2);
        assertEquals(cache.get(2), 2);       // returns 1


        cache = new LRUCache(2 /* capacity */);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(cache.get(1), 1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        assertEquals(cache.get(2), -1);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        assertEquals(cache.get(1), -1);       // returns -1 (not found)
        assertEquals(cache.get(3), 3);       // returns 3
        assertEquals(cache.get(4), 4);       // returns 4

        cache=new LRUCache(1);
        cache.put(2, 1);
        assertEquals(cache.get(2), 1);
        cache.put(3, 2);
        assertEquals(cache.get(2), -1);
        assertEquals(cache.get(3), 2);

    }
}
