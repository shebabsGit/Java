class Jlab53test

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
        double wordCountPerm;
		double charAvg;
		int charMax;
		int charMin;
		double charCountPerm;
		int charCount;


		reverseSentence = "";
		afterIndex = 0;
		beforeIndex = 0;
		spacePosEnd = 0;
		index = 0;
		lastWord = "";
		wordCount = 1;
        wordCountPerm = 1;
		charAvg = 0;
		charMax = 0;
		charMin = 0;
		charCountPerm = 0;
		charCount = 0;

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
                for(index = 0; index <= reverseSentence.length() -1; index ++)
                    {
                        if(reverseSentence.charAt(index) == 32)
                            {
                                wordCountPerm ++;
                            }
						else
							{
								charCountPerm ++;
							}
                    }
				charAvg = charCountPerm / wordCountPerm;
				charMin = firstWord.length();
				for(index = 0; index <= reverseSentence.length() -1; index ++)
					{
						if(reverseSentence.charAt(index) == 32)
							{
								charCount = 0;
							}
						else
							{
								charCount ++;
								if(charMax < charCount)
									{
										charMax = charCount;
									}
								if(charMin > charCount)
									{
										charMin = charCount;
									}
							}
					}
				System.out.println(reverseSentence);
                System.out.println("There are " + wordCountPerm + " words in this sentence ");
				System.out.println("The average amount of characters in each word is " + charAvg);
				System.out.println("The maximum amount of characters in a word in this sentence is " + charMax);
				System.out.println("The minimum amount of characters in a word in this sentence is " + charMin);
			}
		else
			{
				firstWord = sentence;
				charAvg = firstWord.length();
				charMax = firstWord.length();
				charMin = firstWord.length();

				System.out.println(sentence);
                System.out.println("There is one word in this sentence ");
				System.out.println("The average amount of characters in this word is " + charAvg);
				System.out.println("The maximum amount of characters in this word is " + charMax);
				System.out.println("The minimum amount of characters in this word is " + charMin);
			}		
    }
}