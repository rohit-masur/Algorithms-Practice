package algo.linersearch;

public class LinearSearch {
	public static void main(String[] args) {
		int[] intArray = { 1, 3, 4, 6, 74, 3, 2, 21, 5, 7 };

	//	System.out.println(linearSearch(intArray, 55));
		System.out.println(recursiveLinearSearch(intArray, 0,799));

	}

	public static int linearSearch(int[] array, int data) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data) {
				return array[i];

			}
		}

		return -1;
	}

	public static int recursiveLinearSearch(int[] a, int i, int data) {
		if (i > a.length-1) {
			return -1;

		}
		else if (a[i] == data) {
			return i;
		} else {
			System.out.println("index at: "+i);
			return recursiveLinearSearch(a, i + 1, data);
		}

	}
}
