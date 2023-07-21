package DataStructures;

public class BubbleSort {

	// ********* Bubble Sort ********* //
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {9, 5, 8, 1, 6, 2, 3, 7, 4};
		
		bubbleSort(array);
		
		for (int i : array) {
			System.out.print(i);
		}
	}

	public static void bubbleSort(int [] array) {
		
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

}
