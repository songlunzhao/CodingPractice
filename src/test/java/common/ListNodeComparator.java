package common;

import java.util.Comparator;

public class ListNodeComparator implements Comparator<ListNode> {

    @Override
    public int compare(ListNode o1, ListNode o2) {
        if (o1 == null || o2 == null) {
            return 0;
        }
        return o1.val - o2.val;
    }
}
