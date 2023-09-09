package OOPS.Encapsulation;

import OOPS.Encapsulation.Rectangle;

// driver class
public class MainRectangle {


    // driver code
    public static void main(String[] args) {


             Rectangle r1 = new Rectangle();

             r1.setLength(10);
             r1.setBreadth(20);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

        r1.getArea();
    }
}
