package com.myproject.controller;

import java.util.Arrays;

public class Sort {

	public void bubbleSort(Comparable array[]) {
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

	public void insertionort(Comparable array[]) {
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
	
	public void selectionSort(Comparable array[]) {
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
