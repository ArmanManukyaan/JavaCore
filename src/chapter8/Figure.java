package chapter8;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("ploshd figuri ne sapavdayut");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("v oblsti chetiri ugolnika");
        return dim1 * dim2;
    }
}

class Triangle extends Rectangle {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("v oblsti tre ogolnika");
        return dim1 * dim2 / 2;
    }
}


