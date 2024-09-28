
import java.util.*;
class Node{
    int data;
    int next;
    public Node(int data,int next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
};
public class link_list{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        Node head=new Node(arr[0]);
        for(int i=1;i<arr.length;i++){
            Node next=new Node(arr[i],)
        }    
    }
    public static Node arrayll(int[] arr){
        Node head =new Node(arr[0]);
        Node mover=head;
        for(int i=0;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static int length(Node head){
        while
    }
}