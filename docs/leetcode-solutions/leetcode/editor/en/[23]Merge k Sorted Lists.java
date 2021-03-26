//You are given an array of k linked-lists lists, each linked-list is sorted in 
//ascending order. 
//
// Merge all the linked-lists into one sorted linked-list and return it. 
//
// 
// Example 1: 
//
// 
//Input: lists = [[1,4,5],[1,3,4],[2,6]]
//Output: [1,1,2,3,4,4,5,6]
//Explanation: The linked-lists are:
//[
//  1->4->5,
//  1->3->4,
//  2->6
//]
//merging them into one sorted list:
//1->1->2->3->4->4->5->6
// 
//
// Example 2: 
//
// 
//Input: lists = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: lists = [[]]
//Output: []
// 
//
// 
// Constraints: 
//
// 
// k == lists.length 
// 0 <= k <= 10^4 
// 0 <= lists[i].length <= 500 
// -10^4 <= lists[i][j] <= 10^4 
// lists[i] is sorted in ascending order. 
// The sum of lists[i].length won't exceed 10^4. 
// 
// Related Topics Linked List Divide and Conquer Heap 
// 👍 6810 👎 348


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        ListNode head=new ListNode(Integer.MAX_VALUE);
        ListNode tail=head;
//        while(true){
//            Object[] ret=getMinNode(lists);
//            if(ret==null) break;
//            tail.next=(ListNode)ret[0];
//            tail=tail.next;
//            if((Boolean) ret[1]){
//                break;
//            }
//        }
        PriorityQueue<ListNode> q = new PriorityQueue(lists.length, new ListNodeComparator());
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                q.add(lists[i]); // add first Node of each list to queue
            }
        }
        while(!q.isEmpty()){
            tail.next=q.poll();
            tail=tail.next;
            if(tail.next!=null)
                q.add(tail.next);
        }
        return head.next;
    }

    /**
     * could be faster if we store the head nodes into a priority queue.
     * the queue is sorted by Node value, value of the queue is the list index
     * @param lists
     * @return
     */
    public Object[] getMinNode(ListNode[] lists){
        Object[] ret = new Object[2]; //[node, isLastList]
        //get the minimum node of the list,
        // move the head to next on the found node
        int i=0;
        ListNode minNode=null;
        int minIdx=-1;
        int nullListCount=0;
        while(i< lists.length) {
            if(lists[i]==null){
                nullListCount++;
            } else if (minNode==null || lists[i].val<minNode.val){
                minIdx=i;
                minNode=lists[i];
            }
            i++;
        }
        if(nullListCount==lists.length) return null;

        lists[minIdx]=minNode.next;
        ret[0]= minNode;
        if(nullListCount==lists.length-1)
            ret[1]=Boolean.TRUE;
        else
            ret[1]=Boolean.FALSE;
        return ret;
    }

    class ListNodeComparator implements Comparator<ListNode> {

        @Override
        public int compare(ListNode o1, ListNode o2) {
            if(o1==null || o2==null){
                return 0;
            }
            return o1.val-o2.val;
        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)
