//Docs :- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html
package com.company;
import java.util.*;

//Methods in ArrayList and LinkedList are almost same. The only difference in the internal working.

public class Java_LinkedList_92 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(); //Constructs an empty list with an initial capacity of ten.
        LinkedList<Integer> l2 = new LinkedList<>(); //Constructs an empty list with the specified initial capacity.
        l2.add(11); //Appends the specified element to the end of this list.
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.addAll(l2);
//        System.out.println(l1.contains(20));
//        System.out.println(l1.indexOf(14));
//        System.out.println(l1.lastIndexOf(14));
//        System.out.println(l1.remove(4));
//        l1.set(1,1000);
        l1.addFirst(1100);
        l1.addLast(1200);
//        l1.clear();
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
