class Jlab45
// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		String inputName;
		int index;
		String nameReverse;
		int noOfChars;
		char letter;

		nameReverse = "";
		index = 0;
		noOfChars = 0;
		System.out.println("Please enter your name (first name and surname): ");
		inputName = EasyIn.getString();
		noOfChars = inputName.length();
		for(index = noOfChars; index > -1 ; index --)
			{
				if(index == noOfChars)
					{
						index --;
					}
				letter = inputName.charAt(index);
				nameReverse = nameReverse + letter;
			}
		System.out.println(nameReverse + " is your name spelled backwards");
	}
}