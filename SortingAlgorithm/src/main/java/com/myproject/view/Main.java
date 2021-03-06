package com.myproject.view;

import java.util.Arrays;
import java.util.Collections;

import com.myproject.controller.Sort;

public class Main {

	public static void main(String[] args) {
		Character[] charArray = {'a','b','c','x','y','z','1','2','3'};
		Integer[] integerArray = {1,2,3,4,5,6,7,8,9,10};
		Double[] doubleArray = {1.11,2.22,3.33,4.44,5.55,6.66};
		String[] stringArray = {"Jacky", "Aaron", "James", "Queen", "Keele", "Baron"};
		
		// change for array with different data type
		Comparable[] arr = integerArray;
		
		System.out.println();
		Collections.shuffle(Arrays.asList(arr));
		Sort.insertionSort(arr);
		
		System.out.println();
		Collections.shuffle(Arrays.asList(arr));
		Sort.selectionSort(arr);
		
		System.out.println();
		Collections.shuffle(Arrays.asList(arr));
		Sort.bubbleSort(arr);
		
		System.out.println();
		Collections.shuffle(Arrays.asList(arr));
		Sort.mergeSort(arr);
	}

}
