
public class SumWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j= 5;
		int k = max(i, j);
		
		System.out.println("The maximum between" + i + " and " + j + " is " + k);
	
		testPrivate();
	}

	public static int max(int num1, int num2) {
		int result;
		
		if (num1 > num2)
			result = num1;
		else 
			result = num2;
		
		return result;
	}
	
	public static void testPrivate() {
		
		int maxNum;
		
		//method reuse
		maxNum = max(70, 50);
		
		System.out.println("The maxinum number is " + maxNum);
	}
	
}

