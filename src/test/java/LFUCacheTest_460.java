import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LFUCacheTest_460 {

    class LFUCache {

        class Node {
            int key;
            int value;
            int count;
            Node(int key, int value){
                this.key=key;
                this.value=value;
                this.count=1;
            }
        }


        Node head=null, tail=null;
        Map<Integer, Node> keyValues;
        Map<Integer, Queue<Integer>> countMap;
        int capacity=0, minUsage=-1;

        public LFUCache(int capacity) {
            keyValues = new HashMap<>(capacity);
            countMap = new HashMap<>();
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
                node.count++;
                updateCountMap(node);
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
                node.count++;
                updateCountMap(node);
            } else {
                if(keyValues.size()==capacity){
                    removeNode();
                }
                Node node = new Node(key,value);
                addCountMap(node);
                keyValues.put(key, node);
            }
        }

        private void updateCountMap(Node node) {
            if(countMap.containsKey(node.count)){
                countMap.get(node.count).add(node.key);
            } else {
                Queue keyQueue = new LinkedList();
                keyQueue.add(node.key);
                countMap.put(node.count, keyQueue);
            }
            countMap.get(node.count-1).remove(node.key);
            if(minUsage==node.count-1 && countMap.get(node.count-1).isEmpty()){
                minUsage=node.count;
            }
        }

        private void addCountMap(Node node) {
            if(countMap.containsKey(1)){
                countMap.get(1).add(node.key);
            } else {
                Queue keyQueue = new LinkedList();
                keyQueue.add(node.key);
                countMap.put(1, keyQueue);
            }
            if(minUsage!=1)
                minUsage=1;
        }

        /**
         * remove a node from head
         */
        private void removeNode(){
            Integer key = countMap.get(minUsage).poll();
            keyValues.remove(key);
        }


    }
}
