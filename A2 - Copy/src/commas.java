import java.util.Scanner;
public class commas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize and declare sum variable
		int sum = 0;
		
		//create scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numbers separated by commas: ");
		String input = scanner.nextLine();
		
		//Split the string with commas
		String[] numbers = input.split(",");
		
		
		//parse numbers and add to sum
		for (String number : numbers) {
			sum += Integer.parseInt(number.trim());
		}
		
		//print sum results
		System.out.println("The sum of the numbers is: " + sum);
		
		//close scanner
		scanner.close();
	}
	

}
