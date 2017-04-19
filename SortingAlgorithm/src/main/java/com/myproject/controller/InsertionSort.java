package com.myproject.controller;

import java.util.Arrays;

public class InsertionSort {

	public void sort(Comparable array[]) {
		System.out.println("Before Insertion Sort");
		System.out.println(Arrays.toString(array));
		System.out.println("Start Insertion Sort");
		for (int i = 1; i < array.length; i++) {
			Comparable numToSort = array[i];
			int targetIndex = i;
			while (targetIndex > 0 && isLess(numToSort, array[targetIndex - 1])) {
				array[targetIndex] = array[targetIndex - 1];
				targetIndex--;
			}
			array[targetIndex] = numToSort;
			System.out.println(Arrays.toString(array));
		}
		System.out.println("After Insertion Sort");
		System.out.println(Arrays.toString(array));
	}

	private boolean isLess(Comparable j, Comparable minIndex){
		int comparison = j.compareTo(minIndex);
		return comparison < 0;
	}
		
}
