package AdvanceJava.Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);


        // ===================================================
        //  FILTER METHOD
        // Even numbers filter karna
        // ===================================================

        /*
        List<Integer> evenNumbers =list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        */



        // ===================================================
        //  MAP METHOD
        // Square of each number
        // ===================================================

        /*
        List<Integer> squareList = list.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(squareList);
        */



        // ===================================================
        //  SORTED METHOD
        // Sorting numbers
        // ===================================================

        /*
        List<Integer> sortedList =list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        */



        // ===================================================
        //  DESCENDING SORT
        // ===================================================

        /*
        List<Integer> descList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descList);
        */



        // ===================================================
        //  FOREACH METHOD
        // ===================================================

        /*
        list.stream().forEach(System.out::println);
        */



        // ===================================================
        // COUNT METHOD
        // Count even numbers
        // ===================================================

        /*
        long count=list.stream().filter(n->n%2==0).count();
        System.out.println(count);
        */

    

        // ===================================================
        // USING STREAM API
        // ===================================================

        List<Integer> evenList =list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(evenList);

    }
}