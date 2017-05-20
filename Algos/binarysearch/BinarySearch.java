package algo.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	//	int value = binarySearch(intArray, 3);
		int value = recursiveBinarySearch(intArray,0,9,9);
		System.out.println(value);
	}

	public static int binarySearch(int[] arr, int key) {
		int first = 0;
		int last = arr.length - 1;

		while (first <= last) {
			int midpoint = (first + last) / 2;
			if (arr[midpoint] == key) {
				return midpoint;
			} else if (arr[midpoint] > key) {
				last = midpoint - 1;
			} else {
				first = midpoint + 1;
			}
		}

		return -1;
	}

	public static int recursiveBinarySearch(int[] a, int first, int last, int data) {
		System.out.println("[ "+first+" .. " + last + " ] " );
		if (first > last) {
			return -1;
		} else {
			int midpoint = (first + last) / 2;
			if (a[midpoint] == data) {
				return midpoint;
			} else if (a[midpoint] > data) {
				return recursiveBinarySearch(a, first, midpoint - 1, data);
			} else {
				return recursiveBinarySearch(a, midpoint + 1, last, data);
			}

		}

	}
}
