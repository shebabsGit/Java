class EvenOrOdd

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args)
	{
		int numberInput;
		int numberOutput;
		
		System.out.println("Enter a number : ");
		numberInput = EasyIn.getInt();

		numberOutput = numberInput % 2;
		if(numberOutput == 0)
			{
				System.out.println(numberInput + " is even ");
			}
		else
			{
				System.out.println(numberInput + " is odd ");
			}
	}
}
