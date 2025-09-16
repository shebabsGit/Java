class CreditCardInterest

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		double cardInterest;
		double intLow;
		double intHigh;
		double payment;
		double remainAmount;
		final int LIMIT = 500;
		final double MAXINT = 0.18;
		final double MININT = 0.12;

		System.out.println("Enter the amount of money you paid with your credit card : ");
		payment = EasyIn.getDouble();
		if(payment <= LIMIT)
			{
				intLow = MININT*payment;
				remainAmount = 0;
				intHigh = 0;
			}
		else
			{
				intLow = MININT*LIMIT;
				remainAmount = payment - LIMIT;
				intHigh = (MAXINT*remainAmount);
			}
		cardInterest = intHigh + intLow;
		System.out.println("This is the amount you have to pay : " + cardInterest);

	}
}