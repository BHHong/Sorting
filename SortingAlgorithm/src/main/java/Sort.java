
import java.util.Arrays;

public class Sort {

	public static void main(String a[]) {
		int[] arr1 = { 2, 8, 5, 1, 6, 9, 7, 3, 4 };
		System.out.println("Before Insertion Sort");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Start Insertion Sort");
		insertionSort(arr1);
		System.out.println("After Insertion Sort");
		System.out.println(Arrays.toString(arr1));

		System.out.println();

		int[] arr2 = { 2, 8, 5, 1, 6, 9, 7, 3, 4 };
		System.out.println("Before Selection Sort");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Start Selection Sort");
		selectionSort(arr2);
		System.out.println("After Selection Sort");
		System.out.println(Arrays.toString(arr2));

		System.out.println();

		int[] arr3 = { 2, 8, 5, 1, 6, 9, 7, 3, 4 };
		System.out.println("Before Bubble Sort");
		System.out.println(Arrays.toString(arr3));
		System.out.println("Start Bubble Sort");
		bubbleSort(arr3);
		System.out.println("After Bubble Sort");
		System.out.println(Arrays.toString(arr3));
	}

	public static void selectionSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int minValue = array[minIndex];
			array[minIndex] = array[i];
			array[i] = minValue;
			System.out.println(Arrays.toString(array));
		}
	}

	public static void insertionSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int numToSort = array[i];
			int targetIndex = i;
			while (targetIndex > 0 && numToSort < array[targetIndex - 1]) {
				array[targetIndex] = array[targetIndex - 1];
				targetIndex--;
			}
			array[targetIndex] = numToSort;
			System.out.println(Arrays.toString(array));
		}
	}

	public static void bubbleSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					System.out.println(Arrays.toString(array));
				}
			}
		}
	}
}
