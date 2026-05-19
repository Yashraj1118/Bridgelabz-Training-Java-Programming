package AdvanceJava.Generics;

import java.util.*;

public class LowerBoundWildcard {

public static void main(String args[]){

List<? super Integer> list=new ArrayList<Number>();

list.add(100);
list.add(200);

System.out.println(list);

}
}