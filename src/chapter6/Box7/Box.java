package chapter6.Box7;

public class Box {

    double width;
    double height;
    double depth;

    Box(double w ,double h,double d){
        width= w;
        height =h;
        depth =d;
    }
    double volume(){
        return width * height * depth;
    }

}
