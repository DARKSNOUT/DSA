import java.util.*;
class node{
    int data;
    node next;
    node prev;
    public node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public node(int data,node next,node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
    public node arraytoll(int[] arr){
        node main=new node(arr[0]);
        node head=main;
        for(int i=0;i<arr.length;i++){
            node current=new node(arr[i]);
            head.next=current;
            current.prev=head;
            head=current;
        }
        return head;
    }
    public void reverse(node head){
        Stack<Integer> st=new Stack<>();
        node curr=head;
        while(head.next!=null){
            st.push(curr.data);
            curr.next=curr;
        }
        while(temp!=null){
            temp.data=st.pop();
        }
    }
}
public class reverse_dll {
    

}
