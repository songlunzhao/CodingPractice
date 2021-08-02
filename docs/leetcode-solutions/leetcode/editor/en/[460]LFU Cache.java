//Design and implement a data structure for a Least Frequently Used (LFU) cache.
// 
//
// Implement the LFUCache class: 
//
// 
// LFUCache(int capacity) Initializes the object
// with the capacity of the data structure.
// int get(int key) Gets the value of the key if the key exists in the cache. Ot
//herwise, returns -1. 
// void put(int key, int value) Update the value of the key if present, or inser
//ts the key if not already present. When the cache reaches its capacity, it shoul
//d invalidate and remove the least frequently used key before inserting a new ite
//m. For this problem, when there is a tie (i.e., two or more keys with the same f
//requency), the least recently used key would be invalidated. 
// 
//
// To determine the least frequently used key, a use counter is maintained for e
//ach key in the cache. The key with the smallest use counter is the least frequen
//tly used key. 
//
// When a key is first inserted into the cache, its use counter is set to 1 (due
// to the put operation). The use counter for a key in the cache is incremented ei
//ther a get or put operation is called on it. 
//
// 
// Example 1: 
//
// 
//Input
//["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "g
//et"]
//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
//Output
//[null, null, null, 1, null, -1, 3, null, -1, 3, 4]
//
//Explanation
//// cnt(x) = the use counter for key x
//// cache=[] will show the last used order for tiebreakers (leftmost element is
//  most recent)
//LFUCache lfu = new LFUCache(2);
//lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
//lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
//lfu.get(1);      // return 1
//                 // cache=[1,2], cnt(2)=1, cnt(1)=2
//lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalid
//ate 2.
//                 // cache=[3,1], cnt(3)=1, cnt(1)=2
//lfu.get(2);      // return -1 (not found)
//lfu.get(3);      // return 3
//                 // cache=[3,1], cnt(3)=2, cnt(1)=2
//lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1
//.
//                 // cache=[4,3], cnt(4)=1, cnt(3)=2
//lfu.get(1);      // return -1 (not found)
//lfu.get(3);      // return 3
//                 // cache=[3,4], cnt(4)=1, cnt(3)=3
//lfu.get(4);      // return 4
//                 // cache=[3,4], cnt(4)=2, cnt(3)=3
// 
//
// 
// Constraints: 
//
// 
// 0 <= capacity, key, value <= 104 
// At most 105 calls will be made to get and put. 
// 
//
// 
//Follow up: Could you do both operations in O(1) time complexity? Related Topic
//s Design 
// 👍 1871 👎 148


//leetcode submit region begin(Prohibit modification and deletion)
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
        keyValues = new HashMap<>();
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
        if(capacity==0){
            return;
        }
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

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)
