package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */
//package com.java2novice.hashset;

import java.util.HashSet;
class CustomHashSet {
    public static void main(String args[]) {
        // HashSet declaration
        HashSet<String> hset =
                new HashSet<String>();

        // Adding elements to the HashSet

        hset.add("Strawberries");
        hset.add("Blueberries");
        //Addition of duplicate elements
        hset.add("mulberries");
        hset.add("Sapotas");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        //Displaying HashSet elements
        System.out.println(hset);
    }
}