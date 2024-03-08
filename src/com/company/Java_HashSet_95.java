//Docs :- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashSet.html#%3Cinit%3E()
package com.company;

import java.util.HashSet;

public class Java_HashSet_95 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.7f);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        System.out.println(myHashSet);

    }
}


//Why we're using HashSet instead of using Array -> because in HashSet Searching time is constant.

