//Design a queue that supports push and pop operations in the front, middle, and
// back. 
//
// Implement the FrontMiddleBack class: 
//
// 
// FrontMiddleBack() Initializes the queue. 
// void pushFront(int val) Adds val to the front of the queue. 
// void pushMiddle(int val) Adds val to the middle of the queue. 
// void pushBack(int val) Adds val to the back of the queue. 
// int popFront() Removes the front element of the queue and returns it. If the 
//queue is empty, return -1. 
// int popMiddle() Removes the middle element of the queue and returns it. If th
//e queue is empty, return -1. 
// int popBack() Removes the back element of the queue and returns it. If the qu
//eue is empty, return -1. 
// 
//
// Notice that when there are two middle position choices, the operation is perf
//ormed on the frontmost middle position choice. For example: 
//
// 
// Pushing 6 into the middle of [1, 2, 3, 4, 5] results in [1, 2, 6, 3, 4, 5]. 
// Popping the middle from [1, 2, 3, 4, 5, 6] returns 3 and results in [1, 2, 4,
// 5, 6]. 
// 
//
// 
// Example 1: 
//
// 
//Input:
//["FrontMiddleBackQueue", "pushFront", "pushBack", "pushMiddle", "pushMiddle", 
//"popFront", "popMiddle", "popMiddle", "popBack", "popFront"]
//[[], [1], [2], [3], [4], [], [], [], [], []]
//Output:
//[null, null, null, null, null, 1, 3, 4, 2, -1]
//
//Explanation:
//FrontMiddleBackQueue q = new FrontMiddleBackQueue();
//q.pushFront(1);   // [1]
//q.pushBack(2);    // [1, 2]
//q.pushMiddle(3);  // [1, 3, 2]
//q.pushMiddle(4);  // [1, 4, 3, 2]
//q.popFront();     // return 1 -> [4, 3, 2]
//q.popMiddle();    // return 3 -> [4, 2]
//q.popMiddle();    // return 4 -> [2]
//q.popBack();      // return 2 -> []
//q.popFront();     // return -1 -> [] (The queue is empty)
// 
//
// 
// Constraints: 
//
// 
// 1 <= val <= 109 
// At most 1000 calls will be made to pushFront, pushMiddle, pushBack, popFront,
// popMiddle, and popBack. 
// 
// Related Topics Linked List Design Dequeue 
// 👍 185 👎 41


//leetcode submit region begin(Prohibit modification and deletion)
class FrontMiddleBackQueue {

    Node head,tail, middle;
    int len=0;
    class Node {
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public FrontMiddleBackQueue() {
        head=tail=middle=null;
        len=0;
    }

    public void pushFront(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = head;
            middle = head;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            if (len % 2 == 1) {
                //move middle one node left
                middle = middle.prev;
            }
        }
        len++;
    }

    public void pushMiddle(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = head;
            middle = head;
        } else {
            if (len % 2 == 1) {
                //insert in front of current middle, move middle one node left
                node.prev = middle.prev;
                node.next = middle;
                if(middle.prev!=null)
                    middle.prev.next = node;
                middle.prev = node;
                middle = node;
                if(len==1)
                    head=node;
            } else {
                // insert after current middle, move middle one node right
                node.next = middle.next;
                node.prev = middle;
                if(middle.next!=null)
                    middle.next.prev = node;
                middle.next = node;
                middle = node;
            }
        }
        len++;

    }

    public void pushBack(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = head;
            middle = head;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            if (len % 2 == 0) {
                //move middle one node right
                middle = middle.next;
            }
        }
        len++;
    }

    public int popFront() {
        if (head == null) return -1;
        int ret = head.val;
        if (head.next != null) {
            head.next.prev = null;
            head = head.next;
            if (len % 2 == 0) {
                //move middle one node right
                middle = middle.next;
            }
        } else {
            head = null;
            tail = null;
            middle = null;
        }
        len--;
        return ret;
    }

    public int popMiddle() {
        if (middle == null) return -1;
        int ret = middle.val;
        if (len == 1) {
            head = null;
            tail = null;
            middle = null;
        } else if (len % 2 == 1) {
            //use middle.prev as middle
            if (middle.prev != null)
                middle.prev.next = middle.next;
            if (middle.next != null)
                middle.next.prev = middle.prev;
            if(middle==head && middle.prev!=null) {
                head = middle.prev;
                head.prev=null;
            }
            middle = middle.prev;
        } else {
            // use middle.next as middle
            if (middle.prev != null)
                middle.prev.next = middle.next;
            if (middle.next != null)
                middle.next.prev = middle.prev;
            if(middle==head && middle.next!=null) {
                head = middle.next;
                head.prev=null;
            }
            middle = middle.next;
        }
        len--;
        return ret;
    }

    public int popBack() {
        if (tail == null) return -1;
        int ret = tail.val;
        if (tail.prev != null)
            tail.prev.next = null;
        tail = tail.prev;
        if (len == 1) {
            head = null;
            middle = null;
            tail = null;
        } else if (len % 2 == 1) {
            //use middle.prev as middle
            middle = middle.prev;
        }
        len--;
        return ret;
    }

}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
//leetcode submit region end(Prohibit modification and deletion)
