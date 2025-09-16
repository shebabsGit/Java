class ExactNoDivision

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{

		double number1;
		double number2;
		double answer;

		System.out.println("Enter the first number : ");
		number1 = EasyIn.getDouble();
		System.out.println("Enter the second number : ");
		number2 = EasyIn.getDouble();
		answer = number1 % number2;
		if(answer == 0)
			{
				System.out.println("The first number is exactly divisible by the second number ");
			}
		else
			{
				System.out.println("The first number is not exactly divisible by the second number ");
			}
	}
}
