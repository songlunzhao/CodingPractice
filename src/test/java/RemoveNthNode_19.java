import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.testng.Assert.assertEquals;

public class RemoveNthNode_19 {

    @Test
    public void testRemoveNthFromEnd() {



    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        ListNode ret = head;
        while (cur!=null) {
            stack.push(cur);
            cur=cur.next;
        }
        int i=0;
        while (!stack.isEmpty()) {
               ListNode node = stack.pop();
               i++;
               if(i==n){
                   if(!stack.isEmpty()){
                       ListNode node1 = stack.pop();
                       node1.next=node.next;
                   } else {
                       ret = node.next;
                   }
               }
        }

        return ret;
    }
}
