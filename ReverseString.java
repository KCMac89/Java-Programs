
public class ReverseString {

	
	
	public static String Reverse(String s)
	{
		char [] letters = new char[s.length()];
		
		int letterIndex = 0;
		
		for (int i = s.length() - 1; i >= 0; i--) // starts at end of string and loops backwards until 0
		{
			//System.out.println(s.charAt(i));
			letters[letterIndex] = s.charAt(i);  //changes index 0 to last index and loops through
			letterIndex ++;
		}
		
		String reverse = ""; 
		
		for (int i = 0; i < s.length(); i++)  // adds s to string reverse after it has been reordered
		{
			reverse = reverse + letters[i];
		}
		
		return reverse;
	}
	
	
	
	public static void main(String[] args) 
	{
	
		String r = Reverse("Casey");
		System.out.println(r);
		

	}

}
