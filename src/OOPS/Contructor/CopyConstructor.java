package OOPS.Contructor;

import sun.plugin2.gluegen.runtime.CPU;

public class CopyConstructor {

   private String name;
    private int age;



    // setter
    public CopyConstructor(String name , int age)
    {
        this.name = name;
        this.age=age;
    }


    // copy contructor

    public CopyConstructor(CopyConstructor obj)
    {
//        this.name=obj.name;
//        this.age=obj.age;

        this(obj.name,obj.age);
    }

    public void getData()
    {
        System.out.println("Name : "  + name  + " , Age : " + age);
    }
    public static void main(String[] args) {


        CopyConstructor c1= new CopyConstructor("Ansh",20);
        c1.getData();

        CopyConstructor c2 = new CopyConstructor(c1);
        c2.getData();


//        ques

//        this vs this()
    }
}
