package Lab3_LinkedList;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
    
        ListNode newList = new ListNode();
        ListNode head = newList;
        ListNode ans = newList;
        
        if (temp1 == null && temp2 == null) {
            return null;
        }
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                ListNode newNode = new ListNode(temp1.val);
                head.next = newNode;
                head = head.next;
                temp1 = temp1.next;
            }
            else{
                ListNode newNode = new ListNode(temp2.val);
                head.next = newNode;
                head = head.next;
                temp2 = temp2.next;
            }
        }
        while(temp1 != null){
            ListNode newNode = new ListNode(temp1.val);
            head.next = newNode;
            head = head.next;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            ListNode newNode = new ListNode(temp2.val);
            head.next = newNode;
            head = head.next;
            temp2 = temp2.next;
        }
        head = ans.next;
        return head;
    }
}
