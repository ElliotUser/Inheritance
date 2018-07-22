package exc04;

public class B extends A{
    int i;

    public B(int a, int b){
        super.i = a;
        i = b;
    }

    public void show(){
        System.out.println("Член i в суперклассе: "+super.i);
        System.out.println("Член i в подклассе: "+i);
    }
}
