//Docs :- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayDeque.html
package com.company;

import java.util.ArrayDeque;

public class Java_Array_Deque_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>(); //Constructs an empty array deque with an initial capacity sufficient to hold 16 elements.
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        ad1.addFirst(4);
    }
}
