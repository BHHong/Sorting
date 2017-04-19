package com.myproject.controller;

import java.util.Arrays;

public class Sort {

	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;

	public static void insertionSort(Comparable array[]) {
		System.out.println("Before Insertion Sort");
		System.out.println(Arrays.toString(array));
		System.out.println("Start Insertion Sort");
		for (int i = 1; i < array.length; i++) {
			Comparable valueToSort = array[i];
			int targetIndex = i;
			while (targetIndex > 0 && isLess(valueToSort, array[targetIndex - 1])) {
				array[targetIndex] = array[targetIndex - 1];
				targetIndex--;
				count1++;
			}
			array[targetIndex] = valueToSort;
			System.out.println(Arrays.toString(array));
		}
		System.out.println("Total loop: " + count1);
	}

	public static void selectionSort(Comparable array[]) {
		System.out.println("Before Selection Sort");
		System.out.println(Arrays.toString(array));
		System.out.println("Start Selection Sort");
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (isLess(array[j], array[minIndex])) {
					minIndex = j;
				}
				count2++;
			}
			swap(array, i, minIndex);
			System.out.println(Arrays.toString(array));
		}
		System.out.println("Total loop: " + count2);
	}

	public static void bubbleSort(Comparable array[]) {
		System.out.println("Before Bubble Sort");
		System.out.println(Arrays.toString(array));
		System.out.println("Start Bubble Sort");
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (isLess(array[j], array[j - 1])) {
					swap(array, j, j - 1);
					System.out.println(Arrays.toString(array));
				}
				count3++;
			}
		}
		System.out.println("Total loop: " + count3);
	}

	private static boolean isLess(Comparable j, Comparable k) {
		int comparison = j.compareTo(k);
		return comparison < 0;
	}

	private static void swap(Comparable[] array, int j, int k) {
		Comparable temp = array[j];
		array[j] = array[k];
		array[k] = temp;
	}

}
