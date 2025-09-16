class Jlab68

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
		int numbers[] = new int[6];
		int index;
		int afterIndex;
		int even;
		int odd;
		boolean evenOrOdd;

		even = 0;
		odd = 0;
		for(index = 0; index <= numbers.length -1; index ++)
			{
				afterIndex = index +1;
				System.out.println("Enter number " + afterIndex + ": ");
				numbers[index] = EasyIn.getInt();
				evenOrOdd = isEven(numbers[index]);
				if(evenOrOdd == true)
					{
						even ++;
					}
				else
					{
						odd ++;
					}
			}
		System.out.println("There were " + even + " even numbers and " + odd + " odd numbers in your inputs ");
	}
}