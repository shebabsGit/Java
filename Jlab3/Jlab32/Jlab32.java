class Jlab32

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		double result = 0;
		double number;
		
		do
			{
				System.out.println("Enter a number to add : ");
				number = EasyIn.getDouble();
				result = result + number;
				System.out.println("The sum of the numbers is " + result);
			}
		while(number != 0);
		System.out.println("Program terminating... ");
		System.out.println("Done ");
	}
}