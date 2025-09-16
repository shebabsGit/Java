class Jlab42
// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		String inputName;
		String firstName;
		int spacePos;

		System.out.println("Please enter your name (First name and surname): ");
		inputName = EasyIn.getString();
		spacePos = inputName.indexOf(" ");
		firstName = inputName.substring(0, spacePos);
		System.out.println("Your first name is " + firstName);
	}
}