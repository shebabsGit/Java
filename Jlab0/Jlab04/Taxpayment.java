
class Taxpayment

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 22/9/2023
// Purpose : To calculate tax payment

{
	public static void main(String[] args) 
	{

		int child;
		int annualIncome;
		double taxPayment;
		final int TAXPAYMENT0 = 0;
		final int CONSTANT = 5000;
		final double TAX = 0.24;

		System.out.println("Enter the number of children you have : ");
		child = EasyIn.getInt();
		child = child*1000;
		System.out.println("Enter your annual income : ");
		annualIncome = EasyIn.getInt();
		taxPayment = ((annualIncome - child - CONSTANT)*TAX);
		if(taxPayment < 0)
			{
				System.out.println("The taxpayer's tax payment is " + TAXPAYMENT0);
			}
		else
			{
				System.out.println("This is the taxpayer's tax payment : " + taxPayment);
			}
	}
}