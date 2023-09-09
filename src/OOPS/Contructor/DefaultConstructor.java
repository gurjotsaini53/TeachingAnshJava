package OOPS.Contructor;

public class DefaultConstructor {


 private int a , b;

    public DefaultConstructor(){
        a=10;
        b=20;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public static void main(String[] args) {

        DefaultConstructor d1= new DefaultConstructor();

        System.out.println(d1.getA());
    }
}
