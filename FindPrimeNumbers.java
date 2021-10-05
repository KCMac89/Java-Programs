import java.util.ArrayList;

public class FindPrimeNumbers {

	public static void main(String[] args)
	
	{
		
		System.out.println(FindPrimes(1,100));
	}

	public static ArrayList<Integer> FindPrimes(int start, int end)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		
		
		//for testing an array of numbers, i.e. 1,100
		for (int n = start; n < end; n++)
		{

			boolean prime = true;
			
			int i = 2;
			
			while(i <= n/2)
			{
				//System.out.println("Checking if " + i + " is a multiple");
				if (n % i == 0)
				{
					//System.out.println("Yes, we found a multiple: " + i);
					prime = false;
					break;
				}
				i++;
			}
			
			if (prime)
			{
				primes.add(n); // adds the prime numbers to primes array
			}
		}
		
		
		return primes;
	}
}
