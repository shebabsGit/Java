class Jlab51
{
    public static void main(String[] args)

    {
		int index;
		int wordCount;
		int afterIndex;
		String sentence;
		int exitMech;

		exitMech = 0;
		afterIndex = 0;
		wordCount = 0;
    	System.out.println("Enter a sentence: ");
		sentence = EasyIn.getString();
		for (index = 0; index <= sentence.length() - 2; index ++)
   			{
				afterIndex = index + 1;
       			if(sentence.charAt(index) == 32)
					{
						if((sentence.charAt(afterIndex) >= 65 && sentence.charAt(afterIndex) <= 90)	||	(sentence.charAt(afterIndex) >= 97 && sentence.charAt(afterIndex) <= 122))
							{
								if(exitMech == 0)
									{
										wordCount = 1;
										exitMech = 1;
									}
								else
									{
										wordCount ++;
									}
							}
					}
   			}
		if(wordCount == 1)
			{
				System.out.println("There is " + wordCount + " word in the sentence ");
			}
		else if(wordCount == 0)
				{
					System.out.println("There are no words in the sentence ");
				}
			else
				{
					System.out.println("There are " + wordCount + " words in the sentence ");
				}
    }
}