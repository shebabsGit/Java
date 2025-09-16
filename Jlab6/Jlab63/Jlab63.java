class Jlab63

{
	public static int alphaChar(String theString)
	{
		int index;
		int currentCount;

		currentCount = 0;
		for(index = 0; index <= theString.length() -1; index ++)
			{
				if((((theString.charAt(index) >= 'A')) && (theString.charAt(index) <= 'Z')) || ((theString.charAt(index) >= 'a') && (theString.charAt(index) <= 'z')))
					{
						currentCount ++;
					}					
			}
		return currentCount;
	}
	public static void main(String[] args)
	{
		String currentString;
		int count;

		System.out.println("Enter a sentence ");
		currentString = EasyIn.getString();
		count = alphaChar(currentString);
		System.out.println("There are " + count + " alphabetic characters in this sentence ");
	}
}