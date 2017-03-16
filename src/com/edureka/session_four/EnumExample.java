package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;

class CustomEnumExample {

    public static void main(String[] args) {
        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to ArrayList
        arrayList.add("hello");
        arrayList.add("there");
        arrayList.add("meaningful");
        arrayList.add("Dummy");
        arrayList.add("Perth");

        // Get the Enumeration object
        Enumeration<String> e = Collections.enumeration(arrayList);

        // Enumerate through the ArrayList elements
        System.out.println("ArrayList elements: ");
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}