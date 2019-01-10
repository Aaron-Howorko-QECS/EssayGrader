public class EssayGrader 
{
	public static void main(String[] args)
	{
		
		String[] word = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
		for (int i=0; i<word.length; i++) {
		System.out.println(word[i]);
		}
		//compare
		System.out.println(word[0] + "\t" + word[6];
		word[0] = word[0].toLowerCase();
		System.out.println(word[0].compareTo(word[6]));
		// use if on dups
	}
}