import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class LRUCacheTest_146 {

    @Test
    public void testLRUCache(){
        //input:["LRUCache","put","get","put","get","get"]
        // [[1],[2,1],[2],[3,2],[2],[3]] stdout
        LRUCache lruCache = new LRUCache(1);
        lruCache.put(2,1);
        assertEquals(lruCache.get(2),1);
        lruCache = new LRUCache(2);
        lruCache.put(3,2);
        assertEquals(lruCache.get(2),-1);
        assertEquals(lruCache.get(3),2);
    }

    class LRUCache {

        class Node {
            int key;
            int value;
            Node prev;
            Node next;
            Node(int key, int value){
                this.key=key;
                this.value=value;
            }
        }


        Node head=null, tail=null;
        Map<Integer, Node> keyValues;
        int capacity;

        public LRUCache(int capacity) {
            keyValues = new HashMap<>(capacity);
            this.capacity = capacity;
        }


        /**
         * read node, if node exists move it to tail
         * @param key
         * @return
         */
        public int get(int key) {
            if(keyValues.containsKey(key)){
                Node node = keyValues.get(key);
                moveToTail(node);
                return node.value;
            }
            return -1;
        }

        /**
         * insert a node to header, if node exists move it to tail
         * @param key
         * @param value
         */
        public void put(int key, int value) {
            if(keyValues.containsKey(key)){
                Node node = keyValues.get(key);
                node.value=value;
                moveToTail(node);
            } else {
                if(keyValues.size()==capacity){
                    removeNode();
                }
                Node node = new Node(key,value);
                addToTail(node);
                keyValues.put(key, node);
            }
        }

        /**
         * remove a node from head
         */
        private void removeNode(){
            if(head!=null){
                Node tmp = head;
                head=head.next;
                head.prev=null;
                keyValues.remove(tmp.key);
            }
        }

        /**
         * move an existing node to tail
         */
        private void moveToTail(Node node){
            if(node.key==tail.key){
                return;
            }
            if(node.key==head.key){
                node.next.prev=null;
                head=node.next;
            } else {
                node.prev.next=node.next;
                node.next.prev=node.prev;
            }
            tail.next=node;
            node.next=null;
            node.prev=tail;
            tail=node;
        }

        /**
         * add a new node to tail
         */
        private void addToTail(Node node){
            if(head==null){
                head=node;
                tail=node;
            } else {
                tail.next=node;
                node.prev=tail;
                tail=node;
            }

        }
    }
}
