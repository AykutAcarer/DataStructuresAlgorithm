package searchAlgorithms;

public class BinarySearch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array [] = new int [1000000];
		
		int target = 777777;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		//int index = Arrays.binarySearch(array, target);
		
		int index = binarySearchMethod(array, target);
		
		
		if(index == -1) {
			System.out.println(target + " not found");
		}else {
			System.out.println("Element found at: " + index);
		}
	}

	private static int binarySearchMethod(int[] array, int target) {
		
		int lowIndex = 0;
		int highIndex = array.length -1;
		int count = 1;
		
		while (lowIndex <= highIndex) {
			
			int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
			int value = array[middleIndex];
			System.out.println("Steps: " +count);
			System.out.println("Middle Index: " +middleIndex);
			
			if(value < target) {
				lowIndex = middleIndex + 1;
			}else if(value > target) {
				highIndex = middleIndex - 1;
			}else {
				return middleIndex;
			}
			
			count++;
		}
		
		
		return -1;
	}

}
