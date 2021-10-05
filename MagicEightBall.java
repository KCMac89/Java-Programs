import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {

	public static void main(String[] args) {
		
		System.out.println("Enter your question");
		
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();
		
		
		Random rand = new Random();
		int r = rand.nextInt(5);
		
		switch (r) 
		{
		case 0: 
			System.out.println("As I see it, yes.");
			break;
		case 1:
			System.out.println("Signs point to yes.");
			break;
		case 2: 
			System.out.println("Reply hazy, try again.");
			break;
		case 3:
			System.out.println("Don't count on it.");
			break;
		case 4:
			System.out.println("Outlook not so good.");
			break;
		
			
		}
		
	}

}
