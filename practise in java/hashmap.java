import java.util.*;
public class hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> hash=new HashMap<>();
        hash.put("apple",1);
        hash.put("banna",3);
        hash.put("orange",4);

        int ans=hash.get("banna");//value of the key having banana
        System.out.println(ans);

        hash.remove("apple");//removing the value with key apple

        boolean check=hash.containsValue(3);
        System.out.println(check);
    }
}