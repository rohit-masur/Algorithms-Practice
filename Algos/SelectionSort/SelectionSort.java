package algo.SelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] myArray = new int[]{9,8,3,13,87,12,99};
		selectionSort(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

	}
	public static int[] selectionSort(int[] A){
		for(int i = 0; i< A.length-1; i++){
			int min = i;
			for(int j = i+1;j < A.length;j++){
				if(A[j] < A[min]){
					min = j;
				}
			}
			int temp = A[i];
			A[i] = A[min];
			A[min] = temp;
		}
		return A;
	}

}
