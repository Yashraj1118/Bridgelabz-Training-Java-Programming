package AdvanceJava.Generics;
import java.util.*;

public class Demo<T>{

    T container;

    Demo(T container){
        this.container=container;
    }

    public void getValue(){
        System.out.println("Value: "+container);
    }

    public <U> void display(U value){
        System.out.println("data: "+value);
    }


    public static void main(String[] args) {
        Demo<Integer>demo1=new Demo<>(10);
        demo1.getValue();
        demo1.display(101);
        demo1.display("Hello");
        demo1.display(3.14);


        System.out.println("-------------------------------");
        Demo<String>demo2=new Demo<>("Naveen");
        demo2.getValue();
        demo2.display("Welcome");
        demo2.display(202);
        demo2.display(true);
    }
}