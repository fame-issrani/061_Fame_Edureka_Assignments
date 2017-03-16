package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */
//package com.java2novice.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class CollectionExample {
    public static void main(String a[]){
        List<String> li = new ArrayList<String>();
        li.add("I");
        li.add("am");
        li.add("a collection");
        li.add("example");
        System.out.println("List: "+li);
        //create a treeset with the list
        TreeSet<String> myset = new TreeSet<String>(li);
        System.out.println("Set: "+myset);
    }
}