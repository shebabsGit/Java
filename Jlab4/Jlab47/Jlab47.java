class Jlab47
// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		String inputName;
		int occurences;
		int nameLength;
		int index;

		occurences = 0;
		System.out.println("Enter your name (first name and surname): ");
		inputName = EasyIn.getString();
		nameLength = inputName.length();
		for(index = 0; index <= nameLength - 1; index ++)
			{
				if((inputName.charAt(index) == 65)	||	(inputName.charAt(index) == 97))
					{
						occurences ++;
					}
			}
		System.out.println("The letter A was repeated " + occurences + " times");
	}
}