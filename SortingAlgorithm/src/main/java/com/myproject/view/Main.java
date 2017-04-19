package com.myproject.view;

import java.util.Arrays;
import java.util.Collections;

import com.myproject.controller.BubbleSort;
import com.myproject.controller.InsertionSort;
import com.myproject.controller.SelectionSort;

public class Main {

	public static void main(String[] args) {
		Character[] charArray = {'a','b','c','x','y','z','2','1','3'};
		Integer[] integerArray = {1,2,3,4,5,6,7,8,9,10};
		Double[] doubleArray = {1.11,2.22,3.33,4.44,5.55,6.66};
		String[] stringArray = {"Jacky", "Aaron", "James", "Queen", "Keele", "Baron"};
		
		Comparable[] arr = doubleArray;
		
		Collections.shuffle(Arrays.asList(arr));
		new InsertionSort().sort(arr);
		
		System.out.println();
		Collections.shuffle(Arrays.asList(arr));
		new SelectionSort().sort(arr);
		
		System.out.println();
		Collections.shuffle(Arrays.asList(arr));
		new BubbleSort().sort(arr);

		
	}

}