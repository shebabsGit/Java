class XDivisionSteps

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{

		double number1;
		double number2;
		double number3;
		double answer12;
		double answer13;

		System.out.println("Enter the first number : ");
		number1 = EasyIn.getDouble();
		System.out.println("Enter the second number : ");
		number2 = EasyIn.getDouble();
		System.out.println("Enter the third number : ");
		number3 = EasyIn.getDouble();
		answer12 = number1 % number2;
		answer13 = number1 % number3;
		if(answer12 + answer13 == 0)
			{
				System.out.println("The first number is exactly divisible by both numbers ");
			}
		else
			{
				System.out.println("The first number is not exactly divisible by both numbers ");
			}
		if(answer12 == 0)
			{
				System.out.println("The first number is exactly divisible by the second number ");
			}
		else
			{
				System.out.println("The first number is not exactly divisible by the first number ");
			}
		if(answer13 == 0)
			{
				System.out.println("The first number is exactly divisible by the third number ");
			}
		else
			{
				System.out.println("The first number is not exactly divisible by the third number ");
			}
	}
}
