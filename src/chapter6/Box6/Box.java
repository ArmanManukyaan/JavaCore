package chapter6.Box6;

public class Box {

    double width;
    double height;
    double depth;

    Box(){
        System.out.println("konstruktor obeykt box");
        width =10;
        height =10;
        depth =10;
    }
    double volume(){
        return width * height * depth;
    }


}
