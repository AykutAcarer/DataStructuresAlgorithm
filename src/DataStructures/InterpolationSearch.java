package DataStructures;

public class InterpolationSearch {

	// ********* Interpolation Search ********* //
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int [] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
		
		int index = interpolationSearchMethod(array, 256);
		
		if(index != -1) {
			System.out.println("Element found: " +index);
		}else {
			System.out.println("Element not found!");
		}
		
		
	}

	private static int interpolationSearchMethod(int[] array, int value) {
		
		int high = array.length - 1;
		int low = 0;
		int countProbe = 1;
		
		while(value >= array[low] && value <= array[high] && low <= high) {
			
			int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
			
			System.out.println("probe: " + probe);
			System.out.println("Times of Probe: " + countProbe);
			if(array[probe] == value) {
				return probe;
			}else if(array[probe] < value) {
				low = probe + 1;
			}else {
				high = probe - 1;
			}
			
			countProbe++;
		}
		
		return -1;
	}

}
