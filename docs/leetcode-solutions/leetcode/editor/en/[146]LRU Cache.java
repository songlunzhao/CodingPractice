//Design a data structure that follows the constraints of a Least Recently Used 
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
// Follow up: 
//Could you do get and put in O(1) time complexity? 
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
// 0 <= key <= 3000 
// 0 <= value <= 104 
// At most 3 * 104 calls will be made to get and put. 
// 
// Related Topics Design 
// 👍 7950 👎 326


//leetcode submit region begin(Prohibit modification and deletion)
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

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)
