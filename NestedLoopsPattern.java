import java.util.Scanner;

public class NestedLoopsPattern {

	public static void main(String[] args) {
		
		System.out.println("Hello, how many stars would you like?");
		Scanner s  = new Scanner(System.in);
		int numStars = s.nextInt();
		
		
		for (int i = 1; i <= numStars; i++) // outer loop is for rows
		{
			// inner loop is for columns 
			for (int j = 0; j < i; j++)   // j < i, less than column number
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = numStars - 1; i > 0; i--)  // this loop will print 4 *'s then 3,2,1
		{
			for (int j = 0; j < i; j++)   // j < i, less than column number
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
