import org.testng.annotations.Test;

public class PartitionListTest_86 {

    @Test
    public void testPartition() {
        runTest(new Integer[]{1, 4, 3, 2, 5, 2},3);
        runTest(new Integer[]{2, 1},2);
        runTest( new Integer[]{4, 3, 2, 5, 2},3);
        runTest(new Integer[]{1,4,3,0,2,5,2},3);
        //[1,4,3,0,2,5,2]
        //3
        //Output:[1,2,2,0,4,3,5] Expected:[1,0,2,2,4,3,5] stdout:
    }

    private void runTest(Integer[] input, int x){
        ListNode inputHead = buildList(input);
        printQueue(inputHead);
        ListNode head = partition(inputHead, x);
        printQueue(head);
    }
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode p = head, xNode = null, q = null, prevX = null;
        while (p != null) {
            if (p.val >= x) {
                xNode = p;
                break;
            } else {
                q = p;
                p = p.next;
            }
        }
        if (p == null) return head;
        prevX = q;
        q = p;
        p = p.next;
        while (p != null) {
            if (p.val < x) {
                q.next = p.next;
                p.next = xNode;
                if (prevX != null) {
                    prevX.next = p;
                } else {
                    head = p;
                }
                prevX=p;
                p = q.next;
            } else {
                q = p;
                p = p.next;
            }
        }
        return head;
    }

    class ListNode {
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

    private ListNode buildList(Integer[] input) {
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i : input) {
            ListNode c = new ListNode(i);
            cur.next = c;
            cur = cur.next;
        }
        return head.next;
    }

    private void printQueue(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
