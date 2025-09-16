class Jlab41
// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		String inputName;
		String surName;
		int spacePos;

		System.out.println("Please enter your name (First name and surname): ");
		inputName = EasyIn.getString();
		spacePos = inputName.indexOf(" ");
		surName = inputName.substring(spacePos + 1);
		System.out.println("Your surname is " + surName);
	}
}