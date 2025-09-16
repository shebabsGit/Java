class Jlab44
// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		String inputName;
        int upperCase;
		int index;

		System.out.println("Please Enter your name : ");
		inputName = EasyIn.getString();
        index = 0;
		upperCase = 0;
		for(index = 0; index < inputName.length(); index ++)
			{
				if((inputName.charAt(index) <= 90)	&&	(inputName.charAt(index) >= 65))		//Here I referenced an ASCII table
					{
						upperCase ++;
					}
			}
		System.out.println("There are " + upperCase + " upper case letters in your input ");		
	}
}