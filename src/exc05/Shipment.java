package exc05;

import exc03.BoxWeight;

public class Shipment extends BoxWeight {
    private double cost;

    public Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    public Shipment(){
        super();
        cost = -1;
    }

    public Shipment(double w, double h, double d, double m, double c){
        super(w,h,d,m);
        cost = c;
    }

    public Shipment(double len, double m, double c){
        super(len,m);
        cost = c;
    }

    public double getCost() {
        return cost;
    }
}
