class Jlab72

{
	public static void main(String[] args)
	{
		int numbers[] = new int[6];
		int index;
		int afterIndex;
		int highest;
		int lowest;

		index = 0;
		System.out.println("Enter number 1: ");
		numbers[index] = EasyIn.getInt();
		highest = numbers[index];
		lowest = numbers[index];

		for(index = 1; index <= numbers.length -1; index ++)
			{
				afterIndex = index +1;
				System.out.println("Enter number " + afterIndex + ": ");
				numbers[index] = EasyIn.getInt();
				if(numbers[index] > highest)
					{
						highest = numbers[index];
					}
				if(numbers[index] < lowest)
					{
						lowest = numbers[index];
					}
			}
		System.out.println("The highest number you inputted is " + highest + " and the lowest number you inputted was " + lowest);
	}
}