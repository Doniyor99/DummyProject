package com.toolsqa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RandomTesting {

	public static void main(String[] args) {

		String str = "Walgreens";
		char[] arr = str.toCharArray();
		int size = arr.length;

		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < size; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (char key : map.keySet()) {
			System.out.println(key + " - " + map.get(key));
		}
		
		// int[] nums ={42, 33, 12, 61};
		// int moreNums[] = Arrays.copyOf(nums, 8); //this will create new array
		// with 8 items
		//
		// List<Object> evenMoreNums = Arrays.asList(moreNums);
		// evenMoreNums.add(122);
		// evenMoreNums.add(522);
		// int size=evenMoreNums.size();
		// System.out.println(size);
		//
		//
		// // Collections.sort(evenMoreNums); // sort can accept only list( not
		// Set)
		//
		// List<Integer> linkedNumbers = new LinkedList<>();
		// linkedNumbers.add(123);
		// linkedNumbers.add(22);
		//
		//// for (int nums1 : linkedNumbers) {
		//// System.out.println(nums1);
		//// }
		//
		// Iterator<Integer>myIt=linkedNumbers.iterator();
		// while(myIt.hasNext()){
		// int myNum=myIt.next();
		// //System.out.println(myNum);
		// }
	}

}
