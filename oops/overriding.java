import java.util.*;
public class overriding {
    public static void main(String[] args){
        bank t=new bank();
        sbi t1=new sbi();
        axis t2=new axis();
        t.run();
        t1.run();
        t2.run();
        t1.finance();
    }
}
class bank{
    void run(){
        System.out.println("Intrest = 0");
    }
    void finance(){
        System.out.println(1);
    }
}
class axis extends bank{
    void run(){
        System.out.println("Intrest=10");
    }
}
class sbi extends bank{
    void run(){
        System.out.println("Intrest=11");
    }
    void finance(){
        super.finance();
    }
}