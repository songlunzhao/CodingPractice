//Design a data structure that follows the constraints
// of a Least Recently Used
//(LRU) cache. 
//
// Implement the LRUCache class: 
//
// 
// LRUCache(int capacity) Initialize the LRU cache with positive size capacity. 
//
// int get(int key) Return the value of the key if the key exists, otherwise ret
//urn -1. 
// void put(int key, int value) Update the value of the key if the key exists. O
//therwise, add the key-value pair to the cache. If the number of keys exceeds the
// capacity from this operation, evict the least recently used key. 
// 
//
// The functions get and put must each run in O(1) average time complexity. 
//
// 
// Example 1: 
//
// 
//Input
//["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
//Output
//[null, null, null, 1, null, -1, null, -1, 3, 4]
//
//Explanation
//LRUCache lRUCache = new LRUCache(2);
//lRUCache.put(1, 1); // cache is {1=1}
//lRUCache.put(2, 2); // cache is {1=1, 2=2}
//lRUCache.get(1);    // return 1
//lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//lRUCache.get(2);    // returns -1 (not found)
//lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//lRUCache.get(1);    // return -1 (not found)
//lRUCache.get(3);    // return 3
//lRUCache.get(4);    // return 4
// 
//
// 
// Constraints: 
//
// 
// 1 <= capacity <= 3000 
// 0 <= key <= 104 
// 0 <= value <= 105 
// At most 2 * 105 calls will be made to get and put. 
// 
// Related Topics Hash Table Linked List Design Doubly-Linked List 
// 👍 9365 👎 371


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import static org.testng.Assert.assertEquals;

public class LruCache_146 {


    @Test
    public void testLruCache() {
        LRUCache lruCache = new LruCache_146()
                .new LRUCache(3);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);

        assertEquals(lruCache.get(4), 4);
        assertEquals(lruCache.get(3), 3);
        assertEquals(lruCache.get(2), 2);
        assertEquals(lruCache.get(1), -1);
        lruCache.put(5, 5);
        assertEquals(lruCache.get(1), -1);
        assertEquals(lruCache.get(2), 2);
        assertEquals(lruCache.get(3), 3);
        assertEquals(lruCache.get(4), -1);
        assertEquals(lruCache.get(5), 5);


    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class LRUCache {
        class Node {
            int value;
            int key;
            Node prev;
            Node next;
        }
        Map<Integer, Node> keyValue = new HashMap<>();

        int size = 0, max = 0;
        Node head, tail;

        public LRUCache(int capacity) {
            max = capacity;
        }

        public int get(int key) {
            if (keyValue.containsKey(key)) {
                Node node = keyValue.get(key);
                moveToTail(node);
                return node.value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if (keyValue.containsKey(key)) {
                Node node = keyValue.get(key);
                node.value=value;
                moveToTail(node);
                keyValue.put(key, node);
            } else {
                if (size == max) {
                    keyValue.remove(head.key);
                    removeHead();
                } else {
                    size++;
                }
                Node node = new Node();
                node.value=value;
                node.key=key;
                keyValue.put(key, node);
                addToTail(node);
            }

        }

        private void removeHead(){
            if(head==null) return;
            if(head.next!=null) {
                head=head.next;
                head.prev=null;
            }
        }
        private void moveToTail(Node node){
            if(node==tail) return;
            Node pre = node.prev;
            Node next = node.next;
            if(pre!=null){
                pre.next=next;
                if(next!=null){
                    next.prev=pre;
                }
            } else {
                head=node.next;
                head.prev=null;
            }
            addToTail(node);
        }

        private void addToTail(Node node){
            if(head==null){
                head=node;
                tail=node;
            } else {
                tail.next=node;
                node.prev=tail;
                node.next=null;
                tail=node;
            }
        }

    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
