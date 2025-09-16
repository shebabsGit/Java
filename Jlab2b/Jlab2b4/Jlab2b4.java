class Jlab2b4

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

		System.out.println("Enter the first number : ");
		num1 = EasyIn.getDouble();
		System.out.println("Enter the second number : ");
		num2 = EasyIn.getDouble();
		System.out.println("Enter the third number : ");
		num3 = EasyIn.getDouble();
		if((num1 < num2)	&&	(num1 < num3)	&&	(num2 < num3))
			{
				System.out.println("The smallest number is " + num1);
				System.out.println("The numbers in ascending order are " + num1 + ", " + num2 + " and " + num3);
			}
		else if((num1 < num2)	&&	(num1 < num3)	&&	(num3 < num2))
			{
				System.out.println("The smallest number is " + num1);
				System.out.println("The numbers in ascending order are " + num1 + ", " + num3 + " and " + num2);
			}
		else if((num2 < num1)	&&	(num2 < num3)	&&	(num3 < num1))
			{
				System.out.println("The smallest number is " + num2);
				System.out.println("The numbers in ascending order are " + num2 + ", " + num3 + " and " + num1);
			}
		else if((num2 < num1)	&&	(num2 < num3)	&&	(num1 < num3))
			{
				System.out.println("The smallest number is " + num2);
				System.out.println("The numbers in ascending order are " + num2 + ", " + num1 + " and " + num3);
			}
		else if((num3 < num1)	&&	(num3 < num2)	&&	(num1 < num2))
			{
				System.out.println("The smallest number is " + num3);
				System.out.println("The numbers in ascending order are " + num3 + ", " + num1 + " and " + num2);
			}
		else
			{
				System.out.println("The smallest number is " + num3);
				System.out.println("The numbers in ascending order are " + num3 + ", " + num2 + " and " + num1);
			}
	}
}
