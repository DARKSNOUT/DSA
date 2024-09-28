public class bike {
    public static void main(String[] args){
        bike1 b1=new bike1(100,100,100);
        b1.ret();
        b1.func();
        b1.ret();
    }
}
class bike1{
    //final int x=100;
    static int x1=101;
    int x2=102;
    public bike1(int x,int x1,int x2){
       // this.x=x;
        this.x1=x1;
        this.x2=x2;
    }
    void ret(){
        System.out.println(x1);
      //  System.out.println(x);
        System.out.println(x2);
    }
    void func(){
       // this.x=110;
        this.x1=110;
        this.x2=110;
    }
}
