package sortAlgorithms;

public class QuickSort {

	// ******** Quick Sort ******** //
	
	public static void main(String[] args) {
		
		int [] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

		int startIndex = 0;
		int endIndex = array.length - 1;
		
		quickSort(array, startIndex, endIndex);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
		
	
	}

	private static void quickSort(int[] array, int startIndex, int endIndex) {
	
		if(endIndex <= startIndex) return; //base case
		
		int pivot = partition(array, startIndex, endIndex);
		quickSort(array, startIndex, pivot - 1 );
		quickSort(array, pivot + 1, endIndex );
	}
	
	private static int partition(int[] array, int startIndex, int endIndex) {
		
		int pivot = array[endIndex];
		int i = startIndex - 1;
	
		for(int j = startIndex; j <= endIndex - 1; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			} 
		}
		i++;
		int temp = array[i];
		array[i] = array[endIndex];
		array[endIndex] = temp;
		
		return i;
		
	}

}
