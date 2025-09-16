class Jlab34

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		int index = 1;
		double numberInput = 0;
		double smallestNumber = 0;
		double largestNumber = 0;
		double sum = 0;
		double average;
		int n;

		System.out.println("Enter the amount of numbers you would like to input : ");
		n = EasyIn.getInt();
		for(index = 1; index <= n; index ++)
			{
				System.out.println("Enter a number : ");
				numberInput = EasyIn.getDouble();
				if(numberInput < smallestNumber)
					{
						smallestNumber = numberInput;
					}
				else if(numberInput > largestNumber)
						{
							largestNumber = numberInput;
							if(smallestNumber == 0)
								{
									smallestNumber = numberInput;
								}
						}
				sum = sum + numberInput;
			}
		average = sum/n;
		System.out.println("The average of the numbers is " + average);
		System.out.println("The smallest of the numbers is " + smallestNumber);
		System.out.println("The largest of the numbers is " + largestNumber);
	}
}