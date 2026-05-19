package AdvanceJava.Generics;
import java.util.*;

public class LowerBound {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Numbers Added");
    }

    public static void main(String[] args) {

        List<Number> numList =new ArrayList<>();
        addNumbers(numList);
        System.out.println(numList);

        List<Object> objList = new ArrayList<>();
        addNumbers(objList);
        System.out.println(objList);
    }
}