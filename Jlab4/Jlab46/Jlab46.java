class Jlab46
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
		int spacePos;

		System.out.println("Please input your name (first name and surname): ");
		inputName = EasyIn.getString();
		spacePos = inputName.indexOf(" ");
		firstName = inputName.substring(0, spacePos);
		surName = inputName.substring(spacePos + 1);
		System.out.println(inputName + " is outputted as " + surName + " " + firstName);
	}
}