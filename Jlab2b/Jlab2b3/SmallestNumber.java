class SmallestNumber

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double num3;
		double smallestNumber;

		System.out.println("Enter the first number : ");
		num1 = EasyIn.getDouble();
		smallestNumber = num1; 
		System.out.println("Enter the second number : ");
		num2 = EasyIn.getDouble();
		if(num2 < smallestNumber)
			{
				smallestNumber = num2;
			}
		System.out.println("Enter the third number : ");
		num3 = EasyIn.getDouble();
		if(num3 < smallestNumber)
			{
				smallestNumber = num3;
			}
		System.out.println("The smallest number is " + smallestNumber);
	}
}
