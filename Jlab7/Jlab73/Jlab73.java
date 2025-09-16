class Jlab73

{
	public static void main(String[] args)
	{
		int numbers[] = new int[6];
		int index;
		int afterIndex;
		int highest;
		int highestApp;
		int lowest;
		int lowestApp;

		index = 0;
		System.out.println("Enter number 1: ");
		numbers[index] = EasyIn.getInt();
		highest = numbers[index];
		lowest = numbers[index];
		highestApp = 1;
		lowestApp = 1;

		for(index = 1; index <= numbers.length -1; index ++)
			{
				afterIndex = index +1;
				System.out.println("Enter number " + afterIndex + ": ");
				numbers[index] = EasyIn.getInt();
				if(numbers[index] == highest)
					{
						highestApp ++;
					}
				if(numbers[index] == lowest)
					{
						lowestApp ++;
					}
				if(numbers[index] > highest)
					{
						highest = numbers[index];
						highestApp = 1;
					}
				else if(numbers[index] < lowest)
						{
							lowest = numbers[index];
							lowestApp = 1;
						}
			}
		System.out.println("The highest number you inputted was " + highest +
		" and it was repeated " + highestApp + " time(s) and the lowest number you inputted was "
		+ lowest + " and it was repeated " + lowestApp + " time(s)");
	}
}