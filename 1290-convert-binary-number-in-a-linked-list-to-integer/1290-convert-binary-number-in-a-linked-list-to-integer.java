/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer>list = new ArrayList<>();

        ListNode cur = head;
        if(head == null || head.next == null) 
            list.add(cur.val);
        else{
            while(cur !=null){
                list.add(cur.val);
                cur=cur.next;
            }
        }
        int answer = 0;
        Collections.reverse(list);
        answer +=list.get(0);
        int num=2;
        for(int i=1;i<list.size();i++){
            answer += num*list.get(i);
            num *=2;
        }
        
        return answer;
    }
}