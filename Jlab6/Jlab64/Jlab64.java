class Jlab64

{
	public static String award(int theMark)
	{
		String stringR;

		if((theMark >= 70) && (theMark <= 100))
			{
				stringR = "Distinction";
			}
		else if((theMark >= 63) && (theMark <= 69))
			{
				stringR = "Merit1";
			}
		else if((theMark >= 55) && (theMark <= 62))
			{
				stringR = "Merit2";
			}
		else if((theMark >= 40) && (theMark <= 54))
			{
				stringR = "Pass";
			}
		else if((theMark < 40) && (theMark >= 0))
			{
				stringR = "Fail";
			}
		else
			{
				stringR = "Invalid mark";
			}
		return stringR;
	}
	public static void main(String[] args)
	{
		int currentMark;
		String finalString;

		System.out.println("Enter your mark ");
		currentMark = EasyIn.getInt();
		finalString = award(currentMark);
		System.out.println(finalString);
	}
}