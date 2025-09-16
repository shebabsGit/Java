class Jlab6641

{
	public static void mySurname(String theName)
	{
		String justSurname;
		int spacePos;

		spacePos = theName.indexOf(" ");
		justSurname = theName.substring(spacePos + 1);
		System.out.println("Your surname is " + justSurname);
	}
	public static void main(String[] args)
	{
		String name;

		System.out.println("Enter your name(first and surname) ");
		name = EasyIn.getString();
		mySurname(name);
	}
}