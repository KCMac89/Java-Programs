

// This program will find duplicate characters in a String
public class DuplicateChars 
{

	public static void main(String[] args)
	{
		String sentence = "How many duplicates are there?";
		System.out.println(sentence);
		String characters = "";
		String duplicates = "";
		
		for(int i = 0; i < sentence.length(); i++)
		{
			
			String current = Character.toString(sentence.charAt(i));
			
			if (characters.contains(current))
			{
				if (!duplicates.contains(current))
				{
					duplicates += current;
				}
				
			}
			
			characters+= sentence.charAt(i);
			
		}
		System.out.println(duplicates);
		
	}

}
