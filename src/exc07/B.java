package exc07;

public class B extends A{
    int k;

    public B(int a,int b,int c){
        super(a, b);
        k = c;
    }


    public void show(){
        System.out.println("k: "+k);
    }

    public void show(String mgs){
        System.out.println(mgs+k);
    }

//    public void show(){
//        super.show();
//        System.out.println("k: "+k);
//    }


}
