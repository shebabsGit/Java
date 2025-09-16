class Jlab81
{
	public static int findHighest(int[] myInts)
	{
		int myIndex;
		int highestIndex;
		int highestNo;

		highestNo = 0;
		highestIndex = 0;
		for(myIndex = 0; myIndex <= myInts.length -1; myIndex ++)
			{
				if(highestNo == 0)
					{
						highestIndex = myIndex;
						highestNo = myInts[myIndex];
					}
				else if(myInts[myIndex] > highestNo)
						{
							highestIndex = myIndex;
							highestNo = myInts[myIndex];
						}
			}
		return highestIndex;
	}
	public static void main(String[] args)
	{
		int intArray[] = new int[5];
		int index;
		int highestNoIndex;

		for(index = 0; index <= intArray.length -1; index ++)
			{
				System.out.println("Enter number " + index + ": ");
				intArray[index] = EasyIn.getInt();
			}
		highestNoIndex = findHighest(intArray);
		System.out.println(highestNoIndex);
	}
}