import java.util.*;
class node{
    public int data;
    public node next;
    public node back;

    public node(int data,node next,node back){
        this.data=data;
        this.next=next;
        this.back=back;

    }
    public node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class dll{
    public static node insert_at_first(node head,int data){
        node new_node=new node(data);
        head.next=new_node;
        new_node.back=head;
        head=new_node;
        return head;
    }
    public static node at_position(node head,int position,int data){
        node new_node=new node(data);
        if(head==null){
            return head;
        }
        while(head.next!=null){
            head.next=head;
        }
        new_node=insert_at_first(head,data);
        return new_node;
    }
    public static node arraytostring(int[] arr){
        node head=new node(arr[0]);
        node cont=head;
        for(int i=0;i<arr.length;i++){
            node new_node=new node(arr[i]);
            cont.next = new_node;
            new_node.back = cont;
            cont=new_node;
        }
        return head;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            arr[i]=d;
        }
        node head=arraytostring(arr);

    }
}