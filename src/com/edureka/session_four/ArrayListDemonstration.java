package com.edureka.session_four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fame.issrani on 2/24/17.
 */

//Arraylist demonstartion, Linked List demonstartion, iterating through the lists
public class ArrayListDemonstration {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		List<String> words=new LinkedList<>();
		words.add("I");
		words.add("am");
		words.add("linked");
		words.add("List");

		for(String word:words){
			System.out.println(word);
		}
System.out.println("*************************************");

		for(Integer number:numbers){
			System.out.println(number);
		}

	}
}
