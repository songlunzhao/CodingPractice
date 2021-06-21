import com.songlunzhao.leetcode.editor.en.common.Node;

import java.util.*;

public class CopyListWithRandomPointerTest_138 {


    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node cur = head;
        Map<Integer, Integer> nodeIndex = new HashMap<>();//node hashcode & node index in list
        List<Node> nodeList = new ArrayList<>();
        List<Node> nodeList1 = new ArrayList<>();

        int idx=0;
        while (cur!=null) {
            nodeIndex.put(cur.hashCode(),idx);
            nodeList.add(cur);

            Node node = new Node(cur.val);
            nodeList1.add(node);
            if(idx>0){
                nodeList1.get(idx-1).next=node;
            }
            idx++;
            cur=cur.next;
        }
        for(int i=0; i<nodeList.size();i++){
            if(nodeList.get(i).random!=null){
                int index = nodeIndex.get(nodeList.get(i).random.hashCode());
                nodeList1.get(i).random=nodeList1.get(index);
            }
        }


        return nodeList1.get(0);
    }

}
