class Jlab43
// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		String inputName;
		int index;
		int noOfChars;


		System.out.println("Please Enter your name : ");
        noOfChars = 0;
		inputName = EasyIn.getString();
		for(index = 0; index <= inputName.length()-1; index ++)
			{
				noOfChars++;
			}
		System.out.println("There are " + noOfChars + " characters in your input ");
	}
}