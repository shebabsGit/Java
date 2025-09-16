class Jlab61

{
	public static boolean isEven(int theNum)
	{
		boolean evenOrNot;

		if(theNum % 2 == 0)
			{
				evenOrNot = true;
			}
		else
			{
				evenOrNot = false;
			}
		return evenOrNot;
	}
	public static void main(String[] args)
	{
		boolean evenOrOdd;
		int num;

		System.out.println("Enter a number ");
		num = EasyIn.getInt();
		evenOrOdd = isEven(num);
		System.out.println(evenOrOdd);
	}
}