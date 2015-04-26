/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        if(lists.size() == 0) return null;
        while(lists.size() > 1) {
            List<ListNode> next = new ArrayList<>();
            int size = lists.size();
            for(int i = 0; i < size; i += 2) {
                if(i + 1 < size) {
                    next.add(merge(lists.get(i), lists.get(i + 1)));
                }else {
                    next.add(lists.get(i));
                }
            }
            lists = next;
        }
        return lists.get(0);
    }
    
    public ListNode merge(ListNode n1, ListNode n2) {
        ListNode pre = new ListNode(0), curr = pre;
        pre.next = null;
        while(n1 != null && n2 != null) {
            if(n1.val < n2.val) {
                curr.next = n1;
                n1 = n1.next;
            }else {
                curr.next = n2;
                n2 = n2.next;
            }
            curr = curr.next;
        }
        if(n1 != null)curr.next = n1;
        else curr.next = n2;
        return pre.next;
    }
}

