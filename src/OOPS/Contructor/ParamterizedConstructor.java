package OOPS.Contructor;

import org.omg.PortableInterceptor.ServerRequestInterceptor;

public class ParamterizedConstructor {

    private String name;
    private int age;



    // default
    public ParamterizedConstructor(){

    }
    public ParamterizedConstructor(String name , int age){

        this.name=name;
        this.age=age;

    }
    public ParamterizedConstructor(int age , String name){

        this.name=name;
        this.age=age;

    }

   public void getData()
    {
        System.out.println("Name : "  + name  + " , Age : " + age);
    }
    public static void main(String[] args) {



        ParamterizedConstructor p1 = new ParamterizedConstructor("Gurjot", 20);
        ParamterizedConstructor p2 = new ParamterizedConstructor();

        ParamterizedConstructor p3 = new ParamterizedConstructor(20,"Ansh");
        p1.getData();
        p2.getData();
        p3.getData();
    }
}
