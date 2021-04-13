import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class FrontMiddleBackQueueTest_1670 {

    private void testFrontMIddleBackQueueArray(String[]ops, Integer[] values, Integer[]result) {
        //String[] ops = new String[]{"FrontMiddleBackQueue","pushFront","pushBack","pushMiddle","pushMiddle","popFront","popMiddle","popMiddle","popBack","popFront"};
        //String[] result = new String[]{"[]","1","2","3","4","[]","[]","[]","[]","[]"};

        //["FrontMiddleBackQueue","popMiddle","popMiddle","pushMiddle","pushMiddle",
        // "popMiddle","popMiddle","popMiddle","popBack","popMiddle","popFront","pushBack","popFront",
        // "pushMiddle","pushMiddle","popMiddle","popBack","pushFront","popMiddle",
        // "pushMiddle","pushMiddle","pushMiddle","popMiddle","pushMiddle","popBack",
        // "pushMiddle","popMiddle","popMiddle","popMiddle","popMiddle","popFront","pushMiddle","pushMiddle","pushMiddle","pushFront"]
        //[[],[],[],[773222],[279355],[],[],[],[],[],[],[448905],[],[168284],[874541],[],[],[15656],[],
        // [803226],[720129],[626048],[],[860306],[],[630886],[],[],[],[],[],[837735],[414354],[404946],[88719]]

        //[null,-1,-1,null,null,279355,773222,-1,-1,-1,-1,null,448905,null,null,874541,168284,null,
        // 15656,null,null,null,626048,null,803226,null,630886,720129,860306,-1,-1,null,null,null,null]

        Integer[] testResult = new Integer[result.length];

        for(int i=0; i<ops.length; i++){
            switch (ops[i]) {
                case "FrontMiddleBackQueue":
                    FrontMiddleBackQueue();
                    testResult[i]=null;
                    assertResult(result, testResult, i);
                    break;
                case "pushFront":
                    pushFront(values[i]);
                    testResult[i]=null;
                    assertResult(result, testResult, i);
                    break;
                case "pushMiddle":
                    pushMiddle(values[i]);
                    testResult[i]=null;
                    assertResult(result, testResult, i);
                    break;
                case "pushBack":
                    pushBack(values[i]);
                    testResult[i]=null;
                    assertResult(result, testResult, i);
                    break;
                case "popFront":
                    testResult[i]=popFront();
                    assertResult(result, testResult, i);
                    break;
                case "popMiddle":
                    testResult[i]=popMiddle();
                    assertResult(result, testResult, i);
                    break;
                case "popBack":
                    testResult[i]=popBack();
                    assertResult(result, testResult, i);
                    break;
            }
        }
    }

    private void assertResult( Integer[] result, Integer[] testResult, int idx){
        String expected=printResult(result,idx);
        String actual=printResult(testResult, idx);
        printQueue();
        assertEquals(actual, expected);
    }
    private String printResult(Integer[] result, int end ){
        String ret="";
        for(int i=0; i<=end; i++ ){
            if(result[i]==null)
                ret = "null" + " ";
            else
                ret = result[i] + " ";
            System.out.print(ret);
        }
        System.out.println();
        return ret;
    }

    @Test
    public void testFrontMIddleBackQueue() {
        //["FrontMiddleBackQueue","pushFront","pushBack","pushMiddle","pushMiddle","popFront","popMiddle","popMiddle","popBack","popFront"]
        //[[],[1],[2],[3],[4],[],[],[],[],[]]
        String[] ops = new String[]{"FrontMiddleBackQueue", "pushFront", "pushBack", "pushMiddle", "pushMiddle", "popFront", "popMiddle", "popMiddle", "popBack", "popFront"};
        Integer[] values = new Integer[]{null, 1, 2, 3, 4, null, null, null, null, null};
        Integer[] result=new Integer[]{null,null,null,null,null,1,3,4,2,-1};
        testFrontMIddleBackQueueArray(ops,values, result);


        //input:["FrontMiddleBackQueue","pushMiddle","pushMiddle","pushMiddle","popMiddle","popMiddle","popMiddle"]
        // [[],[1],[2],[3],[],[],[]] stdout:
        ops = new String[]{"FrontMiddleBackQueue","pushMiddle","pushMiddle","pushMiddle","popMiddle","popMiddle","popMiddle"};
        values = new Integer[]{null, 1, 2, 3, null, null, null};
        result=new Integer[]{null,null,null,null,3,2,1};
        testFrontMIddleBackQueueArray(ops,values, result);



        //nput:["FrontMiddleBackQueue","pushFront","pushMiddle","pushMiddle","pushFront","pushFront","pushMiddle","popMiddle","popMiddle","pushMiddle","pushMiddle","popFront"]
        // [[],[888438],[772690],[375192],[411268],[885613],[508187],[],[],[111498],[296008],[]]

        ops = new String[]{"FrontMiddleBackQueue","pushFront","pushMiddle","pushMiddle","pushFront","pushFront","pushMiddle",
                "popMiddle","popMiddle","pushMiddle","pushMiddle","popFront"};
        values = new Integer[]{null,888438,772690,375192,411268,885613,508187,null,null,111498,296008,null};
        result=new Integer[]{null,null,null,null,null,null,null,508187,772690,null,null,885613};
        testFrontMIddleBackQueueArray(ops,values, result);



        ops=new String[] {"FrontMiddleBackQueue","popMiddle","popMiddle","pushMiddle","pushMiddle",
        "popMiddle","popMiddle","popMiddle","popBack","popMiddle","popFront","pushBack","popFront",
         "pushMiddle","pushMiddle","popMiddle","popBack","pushFront","popMiddle",
         "pushMiddle","pushMiddle","pushMiddle","popMiddle","pushMiddle","popBack",
         "pushMiddle","popMiddle","popMiddle","popMiddle","popMiddle","popFront","pushMiddle",
                "pushMiddle","pushMiddle","pushFront"};
        values=new Integer[]{null,null,null,773222,279355,null,null,null,null,null,
                null,448905,null,168284,874541,null,null,15656,null,
         803226,720129,626048,null,860306,null,630886,null,null,null,null,null,837735,
                414354,404946,88719};

        result= new Integer[]{null,-1,-1,null,null,279355,773222,-1,-1,-1,-1,null,448905,null,null,874541,168284,null,
        15656,null,null,null,626048,null,803226,null,630886,720129,860306,-1,-1,null,null,null,null};
        testFrontMIddleBackQueueArray(ops,values, result);



    }

    private void printQueue(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val + " ");
            cur=cur.next;
        }
        System.out.println();
    }

    Node head, tail, middle;
    int len = 0;

    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public void FrontMiddleBackQueue() {
        head = tail = middle = null;
        len = 0;
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
