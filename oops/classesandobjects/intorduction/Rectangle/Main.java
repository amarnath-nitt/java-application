package oops.classesandobjects.intorduction.Rectangle;

public class Main {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        System.out.println("Area of rectangle of size " + r1.length + "x" + r1.breadth + " = " + r1.Area());
    }
}
class Rectangle {
    int length;
    int breadth;

    public int Area() {
        return length * breadth;
    }

    public int Perimeter() {
        return 2 * (length + breadth);
    }
}


