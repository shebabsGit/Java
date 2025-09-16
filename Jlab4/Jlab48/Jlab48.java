class Jlab48
// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		String inputName;
		String firstName;
		String surName;
		int index;
		int spacePos;
		int spacePos2;
		int nameLength;
		
		spacePos2 = 1;
		System.out.println("Please input your name (first name, middle name and surname): ");
		inputName = EasyIn.getString();
		nameLength = inputName.length();
		spacePos = inputName.indexOf(" ");

		for(index = nameLength -1; index >= 1; index --)
			{
				if(inputName.charAt(index) == 32) //ASCII table reference
					{
						spacePos2 = index;
						break;
					}
			}
		firstName = inputName.substring(0, spacePos);
		surName = inputName.substring(spacePos2, nameLength);
		System.out.println(firstName + surName);
	}
}