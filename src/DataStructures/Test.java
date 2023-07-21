package dataStructures;

public class Test {

	public int addUpLinear(int n) {
		
		int sum = 0;
		for(int i = 0; i<= n; i++) {
			sum +=i;
		}
		
		return sum;
	}
	
	public int addUpConstant(int n) {
		
		int sum = n * (n + 1) / 2;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();
		long startTime;
		long endTime;
		long result;
		
		
		// *********** 0(n) Linear Time *********** //
		
	
		startTime = System.nanoTime();
		
		//test.addUpLinear(100);	//5600 ns
		test.addUpLinear(1000000);	//8947900 ns
		
		endTime = System.nanoTime();
		
		result = endTime - startTime;
		
		System.out.println("0(n) Linear Time: " + result + " ns"); 
		
		
		// *********** 0(1) Constant Time *********** //
		
		startTime = System.nanoTime();
		
		//test.addUpConstant(100); //8100 ns
		test.addUpConstant(1000000); //7100 ns
		
		endTime = System.nanoTime();
		
		result = endTime - startTime;
		
		System.out.println("0(1) Constant Time: " + result + " ns");
		
	}

}
