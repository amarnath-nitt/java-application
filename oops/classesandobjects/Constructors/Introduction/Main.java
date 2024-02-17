package oops.classesandobjects.Constructors.Introduction;


import java.util.*;
public class Main{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Rectangle r = new Rectangle();
            System.out.println("Enter length of rectange: ");
            int a = sc.nextInt();
            r.setLength(a); 
            System.out.println("Enter breadth of rectangle: ");
            int b = sc.nextInt();
            r.setBreadth(b);
            if(r.isSquare()){
                System.out.println("This is a square.");
                System.out.println("Area of square is "+ r.getArea());
                System.out.println("Perimeter of square is "+ r.getPerimeter());
            }
            else{
                System.out.println("This is a rectangle.");
                System.out.println("Area of rectangle is "+ r.getArea());
                System.out.println("Perimeter of rectangle is "+ r.getPerimeter());
            }
            System.out.println("\n***** Thank You! *****");
            sc.close();
    }
}
class Rectangle{

    int length, breadth;  
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        if(breadth<0){
            System.out.println("Breadth can not be negative, please enter correct value of breadth!");
            System.exit(0);
        }
        else {
            this.breadth = breadth;
        }
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if(length<0){
            System.out.println("Length cann't be negative, please enter correct value of length!");
            System.exit(0);
          }
          else{
              this.length=length;
          }
    }
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth?true:false;
    }
}

