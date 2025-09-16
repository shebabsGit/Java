class Jlab74

{
	public static void main(String[] args)
	{
		char[] chars = new char[6];
		char aChar;
		int index;
		int vowels;
		int consonants;

		vowels = 0;
		consonants = 0;
		for(index = 0; index <= chars.length -1; index ++)
			{
				System.out.println("Enter an alphabetic character : ");
				chars[index] = EasyIn.getChar();
				aChar = chars[index]; //makes code shorter

				if((chars[index] >= 'a') && (chars[index] <= 'z')) //counter for lower case characters
					{
						if((aChar == 'a') || (aChar == 'e') || (aChar == 'i') || (aChar == 'o') || (aChar == 'u'))
							{
								vowels ++;
							}
						else
							{
								consonants ++;
							}
					}
				else if((chars[index] >= 'A') && (chars[index] <= 'Z')) //counter for upper case characters
						{
							if((aChar == 'A') || (aChar == 'E') || (aChar == 'I') || (aChar == 'O') || (aChar == 'U'))
							{
								vowels ++;
							}
						else
							{
								consonants ++;
							}
						}
			}
		System.out.println("There are " + vowels + " vowels and " + consonants + " consonants in this array ");
	}
}