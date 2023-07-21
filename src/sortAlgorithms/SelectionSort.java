package sortAlgorithms;

public class SelectionSort {

	// ******** Selection Sort ******** //
	
	public static void main(String[] args) {
		

		int [] array = {9, 1, 5, 8, 4, 7, 6, 2, 3};
		
		selectionSort(array);
		
		for (int i : array) {
			System.out.print(i);
		}
		
		
	}

	public static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i+1; j < array.length; j++ ) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
	}

}
