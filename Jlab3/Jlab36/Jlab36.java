class Jlab36

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
		int smallestCount = 0;
		int largestCount = 0;
		int n;

		System.out.println("Enter the amount of numbers you would like to input : ");
		n = EasyIn.getInt();
		for(index = 1; index <= n; index ++)
			{
				System.out.println("Enter a number : ");
				numberInput = EasyIn.getDouble();

				sum = sum + numberInput;
				average = sum/index;

				if (index == 1) 
				{
					smallestNumber = numberInput;
					largestNumber = numberInput;

					System.out.println("The average of the numbers is " + average);
					System.out.println("The smallest of the numbers is " + smallestNumber);
					System.out.println("The largest of the numbers is " + largestNumber);
				}
				else 
				{
					if(numberInput <= smallestNumber)
						{
							if(numberInput < smallestNumber)
								{
									smallestCount = 1;
								}
							if(smallestNumber == numberInput)
								{
									smallestCount += 1;
								}
							smallestNumber = numberInput;
						}
					if(numberInput >= largestNumber)
						{
							if(largestNumber < numberInput)
								{
									largestCount = 1;
								}
							if(largestNumber == numberInput)
								{
									largestCount += 1;
								}
							largestNumber = numberInput;
						}
					System.out.println("The average of the numbers is " + average);
					System.out.println("The smallest of the numbers is " + smallestNumber);
					System.out.println("The largest of the numbers is " + largestNumber);
				}
			}
			if(numberInput > largestNumber)
				{
					largestCount = 0;
				}
			else if(numberInput < smallestNumber)
					{
						smallestCount = 0;
					}
			if(smallestCount > 1)
			{
				System.out.println("The smallest number has been repeated " + smallestCount + " time(s) ");
			}
			if(largestCount > 1)
			{
				System.out.println("The largest number has been repeated " + largestCount + " time(s) ");
			}
	}
}