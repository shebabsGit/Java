class Jlab51

{
    public static void main(String[] args)

    {
		int index;
		int beforeIndex;
		int afterIndex;
		String sentence;
		String reverseSentence;
		int sentLength;
		int spacePos;
		int spacePosEnd;
		String firstWord;
		String lastWord;
		int wordCount;

		reverseSentence = "";
		afterIndex = 0;
		beforeIndex = 0;
		spacePosEnd = 0;
		index = 0;
		lastWord = "";
		wordCount = 1;

    	System.out.println("Enter a sentence: ");
		sentence = EasyIn.getString();
		sentLength = sentence.length();

		while((wordCount == 1) && (index != sentLength -1))
			{
				index ++;
				if(sentence.charAt(index) == 32)
					{
						wordCount ++;
					}
			}
		// Word count for identification of a one word sentence

		spacePos = sentence.indexOf(' '); 
		for(index = 0; index <= sentLength -1; index ++)
			{
				if(sentence.charAt(index) == 32)
					{
						spacePosEnd = index;
					}
			}
		//First and Last space positions found above
		//If there are no spaces in sentence, values == -1

		if(wordCount == 2)
			{
				firstWord = sentence.substring(0, spacePos);
				lastWord = sentence.substring(spacePosEnd +1, sentLength);
				reverseSentence = lastWord;
				for (index = spacePosEnd -1; index >= 0; index --)
					{
						afterIndex = index +1;
						beforeIndex = index -1;
						if((sentence.charAt(beforeIndex+1) == 32) && (sentence.charAt(afterIndex) != 32))
							{
								do
									{
										reverseSentence = reverseSentence + sentence.charAt(afterIndex -1);
										afterIndex ++;
									}
								while((afterIndex != spacePosEnd +1) && (sentence.charAt(afterIndex -1) != 32));
							}
					}
				reverseSentence = reverseSentence + " " + firstWord; //First word added to string last
				System.out.println(reverseSentence);
			}
		else
			{
				firstWord = sentence;
				System.out.println(sentence);
			}		
    }
}