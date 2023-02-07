package chapter8.cost;

public class Box {

    private double wight;
    private double height;
    private double depth;

    Box(Box ob) {
        wight = ob.wight;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    Box() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        wight = height = depth = len;
    }

    double volume() {
        return wight * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }
    Shipment(double len , double m,double c){
        super(len, m);
        cost = c;
    }



}
