import java.util.*;
public class reverse_bubble {
    public static void main(String args[]){
        int arr[]={10,2,45,2,12,43};
        int l=arr.length;
        bubble(arr,l);
        for(int i=0;i<l;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void bubble(int arr[],int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-2;i++){
            if(arr[i]>arr[i+1]){
                swap(arr[i],arr[i+1]);
            }
        }
        bubble(arr,n-2);
    }
    public static void swap(int n1,int n2){
        int k=n1;
        n1=n2;
        n2=k;
    }
}
