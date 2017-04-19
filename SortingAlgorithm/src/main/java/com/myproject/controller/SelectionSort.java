package com.myproject.controller;

import java.util.Arrays;

public class SelectionSort {

	public void sort(Comparable array[]) {
		System.out.println("Before Selection Sort");
		System.out.println(Arrays.toString(array));
		System.out.println("Start Selection Sort");
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (isLess(array[j], array[minIndex])) {
					minIndex = j;
				}
			}
			swap(array, i , minIndex);
			System.out.println(Arrays.toString(array));
		}
		System.out.println("After Selection Sort");
		System.out.println(Arrays.toString(array));
	}

	private boolean isLess(Comparable j, Comparable minIndex){
		int comparison = j.compareTo(minIndex);
		return comparison < 0;
	}
	
	private void swap(Comparable[] array, int i, int minIndex){
		Comparable temp = array[minIndex];
		array[minIndex] = array[i];
		array[i] = temp;
	}

}
