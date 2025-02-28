import java.util.Scanner;

public class booksellers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner
		Scanner input = new Scanner(System.in);
		System.out.print("How many books did you purchase?: ");
		int books = input.nextInt();
		
		//if statement for 0 books
		if (books == 0) {
			System.out.println("You earned 0 points.");
		}
		//if statement for 1 book
		if (books == 1) {
			System.out.println("You earned 5 points.");
		}
		//if statement 2 books
		if (books == 2) {
			System.out.println("You earned 15 points.");
		}
		//if statement 3 books
		if (books == 3) {
			System.out.println("You earned 30 points.");
		}
		//if statement books >= 4 more books
		if (books >= 4) {
			System.out.println("You earned 60 points.");
		}
		
		//close scanner object
		input.close();
	}

}
