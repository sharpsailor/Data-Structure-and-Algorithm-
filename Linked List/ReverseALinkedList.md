### Iterative approach 
```
public void reverseDI() {
     int li =0;
     int ri =size-1;
     while(li<ri){
         Node left = getNodeAt(li);
         Node right = getNodeAt(ri);
         int temp = left.data;
         left.data =right.data;
         right.data=temp;
         li++;
         ri--;
     }
    }
```
### Two Pointers approach 
```
public void reversePI(){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr =temp;
        }
        Node temp = head;
        head = tail;
        tail= temp;
        
    }
```
#### or 
```
class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode curr =head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr=temp;
            
        }
        return prev;
    }
}
```
### Recursive approach 
```
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        ListNode headNext= head.next;
        headNext.next = head;
        head.next=null;
        return newHead;
    }
}
```
