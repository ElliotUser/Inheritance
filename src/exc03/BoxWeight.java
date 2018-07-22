package exc03;

import exc01.Box;

public class BoxWeight extends Box {
    public double weight;

    public BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    public BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

    public BoxWeight(){
        super();
        weight = -1;
    }

    public BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
