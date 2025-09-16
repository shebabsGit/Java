class IfelseGrades

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		double prog;
		double maths;
		double hw;
		double avgGrade;
		final int DISTINCTION = 100;
		final int MERIT1 = 70;
		final int MERIT2 = 63;
		final int PASS = 40;
		final int LOWERLIMIT = 0;
		final int UPPERLIMIT = 100;

		System.out.println("Enter your Programming grade : ");
		prog = EasyIn.getDouble();
		System.out.println("Enter your Maths grade : ");
		maths = EasyIn.getDouble();
		System.out.println("Enter your Hardware grade : ");
		hw = EasyIn.getDouble();
		avgGrade = (prog + maths + hw) / 3;
		if((avgGrade >= DISTINCTION)	&&	(avgGrade <= UPPERLIMIT))
			{
				System.out.println("You got a Distinction! ");
			}
		else if(avgGrade >= MERIT1)
			{
				System.out.println("You got a Merit 1! ");
			}
		else if(avgGrade >= MERIT2)
			{
				System.out.println("You got a Merit 2! ");
			}
		else if(avgGrade >= PASS)
			{
				System.out.println("You got a Pass! ");
			}
		else if((avgGrade < PASS)	&&	(avgGrade >= LOWERLIMIT ))
			{
				System.out.println("You failed... ");
			}
		else
			{
				System.out.println("Check the input values and re-run the program ");
			}
	}
}