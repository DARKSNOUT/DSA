import java.util.*;

class node{
    int data;
    dll next;
    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public class learn_ll {
    dll head;
    public void linklist(){
        this.head=null;
    }
    public void append(int data){
        dll new_node=new dll(data);
        if(head==null){
            head=new_node;
            return;
        }
        dll last=head;
        if(last.next!=null){
            last.next=last;
        }
        last.next=new_node;
    }
    public void display(){
        dll current=head;
        while(current.next != null){
            System.out.println(current.data);
            current.next=current;
        }
    }
    public void at_begining(int data){
        dll current=new dll(data);
        current.next=next;
        head=current;
    }
    /*public void insert_at_position(int data,int position){
        node pos=new node(data);
        if(head==null){
            at_begining(data);
            return;
        }
        node current=head;
        for(int i=0;i<position;i++){
            current.next=current;
        }
        pos.next=current.next;
        current.net=pos
    }*/
    public void delete(int key){
        dll current=head;
        dll prev=null;
        if(current!=null && current.data==key){
            head=current.next;
            return;
        }
    }
}
