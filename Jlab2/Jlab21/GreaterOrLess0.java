
class GreaterOrLess0

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{

		int number;

		System.out.println("Enter a whole number : ");
		number = EasyIn.getInt();
		if(number > 0)
			{
				System.out.println("This number is greater than 0 ");
			}
		else if(number == 0)
			{	
				System.out.println("This number is equal to 0 ");
			}
		else
			{	
				System.out.println("This number is less than 0");
			}
	}
}
