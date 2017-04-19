package com.myproject.controller;

import java.util.Arrays;

public class BubbleSort {

	public void sort(Comparable array[]) {
		System.out.println("Before Bubble Sort");
		System.out.println(Arrays.toString(array));
		System.out.println("Start Bubble Sort");
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (isLess(array[j], array[j - 1])) {
					swap(array, j, j - 1);
					System.out.println(Arrays.toString(array));
				}
			}
		}
		System.out.println("After Bubble Sort");
		System.out.println(Arrays.toString(array));
	}

	private boolean isLess(Comparable j, Comparable k) {
		int comparison = j.compareTo(k);
		return comparison < 0;
	}

	private void swap(Comparable[] array, int j, int k) {
		Comparable temp = array[j];
		array[j] = array[k];
		array[k] = temp;
	}

}
