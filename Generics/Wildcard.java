package AdvanceJava.Generics;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
public class Wildcard {
    public static void displayValue(List<?> list) {
        for(Object element:list){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        displayValue(Arrays.asList(1,2,3));
        System.out.println("-----------------------------");
        displayValue(Arrays.asList("Hello","World"));
        System.out.println("-----------------------------");
        displayValue(Arrays.asList(1.5,2.5,3.5));
    }
}