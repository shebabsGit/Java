class InsurancePremium

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		double insPremFut;
		double insPremPast;
		int noOfClaims;
		double charge;
		double discount;
		double postCharge;
		double basicPrem;

		System.out.println("Enter your last year's premium : ");
		insPremPast = EasyIn.getDouble();
		basicPrem = 0.05*insPremPast;
		System.out.println("Enter the number of claims you made last year : ");
		noOfClaims = EasyIn.getInt();
		if(noOfClaims == 0)
			{
				discount = 0.4;
			}
		else
			{
				discount = 0;
			}
		if(noOfClaims != 0)
			{
				charge = 0.2*noOfClaims;
			}
		else
			{
				charge = 0;
			}
		insPremPast = insPremPast + basicPrem;
		postCharge = charge*insPremPast;
		insPremFut = ((insPremPast + postCharge) - discount);
		if(insPremFut < 0)
			{
				System.out.println("Check your input values and re-run the program ");
			}
		else
			{
				System.out.println("Next year's insurance premium is " + insPremFut);
			}
	}
}
