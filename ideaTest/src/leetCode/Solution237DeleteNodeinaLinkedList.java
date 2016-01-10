package leetCode;



/**
 * Created by lenovo on 2016/1/10.
 */
public class Solution237DeleteNodeinaLinkedList {
    //链表节点个数
    public final static int NUM=10;
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        ListNode head=node;
        //创建链表
        for(int i=0;i<NUM-1;i++){
            node.next=new ListNode(i+2);
            node=node.next;
        }
        //打印链表
        node=head;
        while(null!=node) {
            System.out.print(node.val+" ");
            node= node.next;
        }
        System.out.print("\r\n");
        //定位删除节点
        node=head;
        for (int i=0;i<4-1;i++){
            if(null!=node.next)
                node=node.next;
        }
        deleteNode(node);
        //打印删除后的链表
        node=head;
        while(null!=node) {
            System.out.print(node.val+" ");
            node= node.next;
        }
        System.out.print("\r\n");
    }

    public static void deleteNode(ListNode node){
        //删除节点
        if(null!=node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
