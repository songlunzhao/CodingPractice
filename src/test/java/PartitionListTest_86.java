import com.songlunzhao.leetcode.editor.en.common.ListNode;
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
        ListNode inputHead = ListNode.buildList(input);
        ListNode.printQueue(inputHead);
        ListNode head = partition(inputHead, x);
        ListNode.printQueue(head);
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

}
