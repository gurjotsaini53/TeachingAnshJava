package OOPS.Encapsulation;

public class Rectangle {


    // attributes
    private int length , breadth ;

    // field - containers e.g. enums , interface , methods


    // setters
    public void setLength(int length){
        this.length=length;
    }
    public void  setBreadth(int breadth){
        this.breadth=breadth;
    }


    // getters

    public int getLength()
    {
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public void getArea(){
        System.out.println("Area : " + (length * breadth));
    }


}
