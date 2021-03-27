import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeTwoListTest_21 {

    @Test
    public void testMergeTwoLists() {
        //Wrong Answer: input:[1,2,4] [1,3,4] Output:[1,3,4]
        // Expected:[1,1,2,3,4,4] stdout:
    }

    @Test
    public void testMergeKLists() {
        ListNode[] lists = new ListNode[3];
        lists[0]=createList(new int[]{2});
        lists[1]=createList(new int[]{1,3});
        lists[2]=createList(new int[]{2,4});

        ListNode ret = mergeKListsNew(lists);

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode head = new ListNode(Integer.MAX_VALUE);
        ListNode tail = head;
        ListNode lastList;
        while (true) {
            Object[] ret = getMinNode(lists);
            tail.next = (ListNode) ret[0];
            tail = tail.next;
            if ((Boolean) ret[1]) {
                break;
            }
        }
        return head.next;

    }

    public Object[] getMinNode(ListNode[] lists) {
        Object[] ret = new Object[2]; //[node, isLastList]
        //get the minimum node of the list,
        // move the head to next on the found node
        int i = 0;
        ListNode minNode = null;
        int minIdx = -1;
        int nullListCount = 0;
        while (i < lists.length) {
            if (lists[i] == null) {
                nullListCount++;
            } else if (minNode == null || lists[i].val < minNode.val) {
                minIdx = i;
                minNode = lists[i];
            }
            i++;
        }
        if (nullListCount == lists.length) return null;
        lists[minIdx] = minNode.next;
        ret[0] = minNode;
        if (nullListCount == lists.length - 1)
            ret[1] = Boolean.TRUE;
        else
            ret[1] = Boolean.FALSE;
        return ret;
    }

    public ListNode mergeKListsNew(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode head = new ListNode(Integer.MAX_VALUE);
        ListNode tail = head;
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
                // add first Node of each list to queue
                // make sure not adding null to queue
                q.add(lists[i]);
            }
        }
        while (!q.isEmpty()) {
            tail.next = q.poll();
            tail = tail.next;
            if (tail.next != null)
                // make sure not adding null to queue
                q.add(tail.next);
        }
        return head.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //following logic is too complicated, better to use a dummy head
        ListNode head = null, current = null;
        ListNode l1Head = l1;
        ListNode l2Head = l2;
        while (l1Head != null && l2Head != null) {
            if (l1Head.val < l2Head.val) {
                if (head == null) {
                    head = l1Head;
                    current = l1Head;
                } else {
                    current.next = l1Head;
                    current = current.next;
                }
                l1Head = l1Head.next;
            } else {
                if (head == null) {
                    head = l2Head;
                    current = l2Head;
                } else {
                    current.next = l2Head;
                    current = current.next;
                }
                l2Head = l2Head.next;
            }
        }
        if (l1Head != null) {
            if (head == null) {
                head = l1Head;
            } else {
                current.next = l1Head;
            }
        } else {
            if (head == null) {
                head = l2Head;
            } else {
                current.next = l2Head;
            }
        }
        return head;
    }

    public ListNode createList(int[] array) {
        ListNode head = null, current = null;
        for (int i = 0; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            if (head == null) {
                head = node;
                current = node;
            } else {
                current.next = node;
                current = node;
            }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class ListNodeComparator implements Comparator<ListNode> {

        @Override
        public int compare(ListNode o1, ListNode o2) {
            if (o1 == null || o2 == null) {
                return 0;
            }
            return o1.val - o2.val;
        }

    }
}
