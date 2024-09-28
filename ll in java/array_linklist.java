import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data= data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class array_linklist{
    public static Node arrayLL(int[] arr){
        Node head= new Node(arr[0]);
        Node Mover=head;
        for(int i=0;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            Mover.next=temp;
            Mover=temp;
        }
        return head;
    }
    private static int lengthofLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node head=arrayLL(arr);
        System.out.println(head.data);
        System.out.print(lengthofLL(head));
    }
}