/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        
        RandomListNode CopyHead = head;
        RandomListNode Next;
        
        /*先将所有复制的节点插在 所复制节点的后面 如1-1-2-2-3-3-4-4*/
        while(CopyHead!=null){
            Next = CopyHead.next;
            RandomListNode Copy = new RandomListNode(CopyHead.label);
            CopyHead.next = Copy;
            Copy.next = Next;
            CopyHead = Next;
        }
        CopyHead=head;
        /*拷贝random，即random=拷贝节点random指向的节点的next节点*/
        while(CopyHead!=null){
            if(CopyHead.random!=null) CopyHead.next.random=CopyHead.random.next;
            CopyHead=CopyHead.next.next;
        }
        
        RandomListNode result=new RandomListNode(0);
        RandomListNode node=head;
        CopyHead=result;
        /*取出复制出来的链*/
        while(node != null){
            CopyHead.next=node.next;
            CopyHead=CopyHead.next;
            node.next=node.next.next;
            node=node.next;
        }
        
        return result.next;
    }
}