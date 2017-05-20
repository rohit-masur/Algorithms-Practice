package algo.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArray = new int[] { 9, 8, 3, 13, 87, 12, 99 };
		int[] myArr = insertionSort(intArray);
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}

	}

	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length - 1; i++) {
			int element = a[i];
			int j = i - 1;

			while ((j >= 0) && (a[j] > element)) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
	}

}
