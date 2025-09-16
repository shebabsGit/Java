class Jlab75
{
	public static void main(String[] args)
	{
		char charsArray[] = new char[4];
		String sentence;
		String reverseSentence;
		int index;

		sentence = "";
		reverseSentence = "";
		for(index = 0; index <= charsArray.length -1; index ++)
			{
				System.out.println("Enter an alphabetic character " + index + ": ");
				charsArray[index] = EasyIn.getChar();
			}
		for(index = 0; index <= charsArray.length -1; index ++)
			{
				sentence = sentence + charsArray[index];
			}
		for(index = charsArray.length -1; index >= 0; index --)
			{
				reverseSentence = reverseSentence + charsArray[index];
			}
		if(sentence.equals(reverseSentence))
			{
				System.out.println("It is a palindrome ");
			}
		else
			{
				System.out.println("It is not a palindrome ");
			}
	}
}