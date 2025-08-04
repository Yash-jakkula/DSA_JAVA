class ListNode{
    int data;
    ListNode next;
    ListNode(){}
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
    ListNode(int data,ListNode node){
        this.data = data;
        this.next = node;
    }
}

class Solution {
    public ListNode reverse(ListNode head){
        ListNode temp = head,prev=null;
        while(temp.next!=null){
            ListNode curr=temp.next;
            temp.next = prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
    public ListNode findKthNode(ListNode head,int k){
        ListNode temp = head;
        k-=1;
        while(k>0 && temp!=null){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode kthNode = findKthNode(temp,k);

            if(kthNode == null){
                if(prevNode!=null)
                {
                    prevNode.next = temp;
                }
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);

            if(temp == head){
                head=kthNode;
            }
            else{
                prevNode.next = kthNode;
            }
            prevNode = temp;

            temp=nextNode;
        }
        return head;
    }
}


public class LinkedListRotateinK {
    public static void main(String args[]) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2, node);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(5, node3);
        Solution sol = new Solution();
        ListNode ans = sol.reverseKGroup(node4, 2);
        while (node4 != null) {
            System.out.print(node4.data + " ");
            node4 = node4.next;
        }
    }

}
