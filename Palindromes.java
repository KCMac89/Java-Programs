import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		
		// examples: mom, dad, pop, race car, nurses run
		
		//String original = "race car";
		//original = original.replace(" ", "");  // removes spaces
		
		
		char b = 'm';
		String reverse = "";
		
		// added
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter a word to see if it is a palindrome");
		String original = s.next();
		original = original.replace(" ", "");  // removes spaces, not working
		
		for (int i = original.length() -1; i >= 0; i--)
		{
			reverse += original.charAt(i);
			//System.out.println(reverse);
		}
		boolean palindrome = true;
		
		for (int i = 0; i < original.length();i++)
		{
			
			if (original.charAt(i) != reverse.charAt(i))
			{
				palindrome = false;
			}
		}
		
		if (palindrome)
		{
			System.out.println("Is a palindrome!");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
